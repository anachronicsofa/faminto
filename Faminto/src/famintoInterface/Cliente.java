package famintoInterface;

public class Cliente {
	private String nome;
	private String endereco;
	private String telefone;
	private String referencia;
	private boolean ativo;
	private int devolucoes; 

	public Cliente(String nome, String endereco, String telefone, String referencia) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.referencia = referencia;
        this.ativo = true; 
        this.devolucoes = 0; 
    }
	
	
	public int getDevolucoes() {
		return devolucoes;
		}

	public void setDevolucoes(int devolucoes) {
		this.devolucoes = devolucoes;
		}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}