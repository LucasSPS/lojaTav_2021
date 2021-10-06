package Model;

import java.util.Date;

import lojaTav2021.Interfaces.IEntrega;

public class Entrega {

	public int idEntrega;// { get; set; }
    public int idEndereco;// { get; set; }
    public Date agendamento;// { get; set; }
    public Boolean ValidaEntrega(IEntrega entrega)
    {
        return true;
    }
	public int getIdEntrega() {
		return idEntrega;
	}
	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}
	public int getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public Date getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(Date agendamento) {
		this.agendamento = agendamento;
	}
    
    
}

