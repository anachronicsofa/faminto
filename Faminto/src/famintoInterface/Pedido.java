package famintoInterface;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Pedido {

		private ArrayList<ItemPedido> itens = new ArrayList<>();
		private String situacao = "pendente";//pendente, atendido, cancelado, devolvido
		private Date data =  new Date();
		private int quantidadePedida; 
		private Cliente cliente; 
		private String formaDePagamento; 
		//@ManyToOne
		private Entregador entregador;
		private Cheque cheque; 
				
		public Pedido (Cliente cliente) {
			if (cliente.isAtivo()) {
				this.cliente = cliente;
			}
		}
		
		// Adicionar item ao pedido 
		public void addItem(Cardapio cardapio, int quantidade) {
			if (cardapio.getClass()== Bebida.class) {
				if (cardapio.temEstoque(quantidade)) {
					ItemPedido item = new ItemPedido(quantidade, cardapio, this);
					itens.add(item);
				} else { 
					System.out.println("Não há estoque suficiente de bebida!");
				}
			} else {
			ItemPedido item = new ItemPedido(quantidade, cardapio, this);
			itens.add(item);
			}
		}
		 // Enviar para Entregador
		public void irParaEntregador (Entregador entregador) {
			this.setEntregador(entregador);
			this.situacao = "Enviado para Entrega.";
		}
		
		// Cancelar Pedido 
		public void cancelarPedido () {
			if (this.getSituacao()=="pendente") {
				this.situacao = "cancelado";				
			} else {
				System.out.println("Não é possível cancelar seu pedido.");
			}
		}
		
		// Alterar Pedido 
		public void alterarPedido (Cardapio cardapio, int quantidade) {
			if (this.getSituacao()=="pendente") {
				this.addItem(cardapio, quantidade);
			} else {
				System.out.println("Não é possível alterar seu pedido.");
			}
		}

		public double getValorTotal() {
	        float total = 0;
	        for (ItemPedido pedido : itens) {
	            total += pedido.getSubtotal();
	        }
	        return total;
	    }
		
		public ArrayList<ItemPedido> getPedidos() {
			return itens;
		}

		public void setPedidos(ArrayList<ItemPedido> itens) {
			this.itens = itens;
		}

		public String getSituacao() {
			return situacao;
		}

		public void setSituacao(String situacao) {
			this.situacao = situacao;
		}

		public String getData() {
			SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	        return dataFormatada.format(this.data);
		}

	    public void setData(Date data) {
	        this.data = data;
	    }
	    
	    public String getFormaDePagamento() {
			return formaDePagamento;
		}

		public void setFormaDePagamento(String formaDePagamento) {
			this.formaDePagamento = formaDePagamento;
		}
		
		public Cheque getCheque() {
			return cheque;
		}

		public void setCheque(Cheque cheque) {
			this.cheque = cheque;
		}
		
		public Entregador getEntregador() {
			return entregador;
		}

		public void setEntregador(Entregador entregador) {
			this.entregador = entregador;
		}
		
		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		
}
		