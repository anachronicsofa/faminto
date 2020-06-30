package famintoInterface;

public class Cheque {
	public int  numero;
	public int conta;
	public int agencia; 
	public String banco;
	
	Cheque () {
		
	}
	
	Cheque (int numero, int conta, int agencia, String banco){
		this.numero=numero;
		this.conta=conta;
		this.agencia=agencia;
		this.banco=banco; 
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
}