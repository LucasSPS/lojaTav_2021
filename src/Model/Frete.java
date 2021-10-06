package Model;

public class Frete {
	public int idFrete;// { get; set; }
    public double valorFrete;// { get; set; }
    public int cep;// { get; set; }
	public int getIdFrete() {
		return idFrete;
	}
	public void setIdFrete(int idFrete) {
		this.idFrete = idFrete;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
    
}