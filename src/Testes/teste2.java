package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Entrega;
import Model.Pedido;
import junit.framework.Assert;
import lojaTav2021.Interfaces.ICliente;
import lojaTav2021.Interfaces.IEntrega;

class teste2 {
	
	private ICliente Cliente;
	
	 @Test
     public void ValidaEntregaIdZerado()
     {
         // Arrange
         Pedido pedido = new Pedido(1, 12, 0, 15.98);
         Boolean esperado = false;
         IEntrega entrega = new Entrega();
        
         Mock(IEntrega) mock = new mock(IEntrega)();
         mock.Setup(m => m.ValidaEntrega(entrega)).Returns(true);
 
         //ACT
         var result = pedido.ValidaEntrega(entrega);

         // Assert
         Assert.assertEquals(result, esperado);
     }

}
