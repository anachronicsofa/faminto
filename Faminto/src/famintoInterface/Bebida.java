package famintoInterface;

public class Bebida extends Cardapio {
    protected int estoque;

    public Bebida(String nome, double preco, int estoque) {
    	super(nome, preco);
    	this.estoque = estoque;
    }
    
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque=estoque;
    }


    public boolean temEstoque(int qtd) {
		if (estoque>=qtd) {
    		estoque = estoque-qtd; 
    		return true;
    	} else {
    		return false; 
    	}	
	}
    
    @Override
    public String toString() {
        return " Estoque: " + estoque + "| Produto: " + nome + " | Preço: R$ " + preco + "\n ";
    }
} 