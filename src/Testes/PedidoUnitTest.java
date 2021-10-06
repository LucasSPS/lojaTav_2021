package Testes;

import lojaTav2021.Model.*;
import lojaTav2021.Interfaces.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PedidoUnitTest {

        private ICliente Cliente;
        
        @Test
        public void ValidaEntregaIdZerado()
        {
            // Arrange
            Pedido pedido = new Pedido(1, 12, 0, 15.98);
            bool esperado = false;
            IEntrega entrega = new Entrega();
            mock(IEntrega) mock = new Mock<IEntrega>();
            mock.Setup(m => m.ValidaEntrega(entrega)).Returns(true);

            //ACT
            var result = pedido.ValidaEntrega(entrega);

            // Assert
            Assert.Equal(result, esperado);
        }
        [Fact]
        public void CalculaFreteTest1()
        {
            // Arrange
            _mockCliente = new Mock<ICliente>();
            Cliente cliente = new Cliente()
            {
                idCliente = 3,
                endereco = "Clarimundo de Melo 857",
                cep = 20123456
            };
            double esperado = 7.26;
            int cep = 20123456;
            _mockCliente.Setup(x => x.getCepById(3)).Returns(cliente.cep);

            Mock<IFrete> _mockFrete = new Mock<IFrete>();
            Frete frete = new Frete()
            {
                idFrete = 25,
                cep = 20123456,
                valorFrete = 7.26
            };
            _mockFrete.Setup(y => y.GetValorFrete(cep)).Returns(frete.valorFrete);

            // ACT
            Pedido pedido = new Pedido(1, 3, _mockCliente.Object, _mockFrete.Object, 5, 25.56);
            double resultado = pedido.CalcularFrete();

            //Assert
            Assert.Equal(esperado, resultado);
        }
    }
}