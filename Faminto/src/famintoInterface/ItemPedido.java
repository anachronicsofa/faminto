package famintoInterface;

public class ItemPedido {
	private int quantidade = 0;
	private Cardapio cardapio;
	private Pedido pedido; 
	
	public double getSubtotal() {
        return cardapio.getPreco() * quantidade; 
    }
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public ItemPedido(int qtd, Cardapio cardapio, Pedido pedido) {
		this.cardapio=cardapio; 
		this.quantidade = qtd;
		this.pedido =pedido; 
	}
	
	@Override
	public String toString() {
		return "[Quantidade: " + quantidade + " "+cardapio+"]";
	}
}