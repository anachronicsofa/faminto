package famintoInterface;

import java.util.ArrayList;
import java.util.List;

public class Entregador {
	
	public String nome;
	public String placaDoVeiculo;
	public int quantidadeDeEntregas; 
	public double totalEntregas; 
    private ArrayList<Pedido> entregas = new ArrayList<Pedido>();
    

    public Entregador(String nome, String placaDoVeiculo) {
    	this.nome = nome;
    	this.placaDoVeiculo = placaDoVeiculo;
    	quantidadeDeEntregas = 0; 
    	totalEntregas = 0; 
    }
    
    public String getNome() {
		return nome;
	}

	public String getPlacaDoVeiculo() {
		return placaDoVeiculo;
	}
	
	public int getQuantidadeDeEntregas() {
		return quantidadeDeEntregas;
	}

	public double getTotalEntregas() {
		return totalEntregas;
	}

	public void setQuantidadeDeEntregas(int quantidadeDeEntregas) {
		this.quantidadeDeEntregas = quantidadeDeEntregas;
	}

	public void setTotalEntregas(double totalEntregas) {
		this.totalEntregas = totalEntregas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPlacaDoVeiculo(String placaDoVeiculo) {
		this.placaDoVeiculo = placaDoVeiculo;
	}
    
    public ArrayList<Pedido> getEntregas() {
        return entregas;
    }

    public void setEntregas(ArrayList<Pedido> entregas) {
        this.entregas = entregas;
    }

    public void addEntrega(Pedido pedido) {
        entregas.add(pedido);
    }
    
    // Entregar o Pedido para o Cliente, Atualizando os valores do Entregador
    public void entregarPedido (Pedido pedido, boolean realizado) {
    	if(this.entregas.contains(pedido)) {
    		if (!realizado) {
    			pedido.setSituacao("devolvido");
    			int devolucoes = pedido.getCliente().getDevolucoes(); 
    			pedido.getCliente().setDevolucoes(devolucoes++);
    			if (pedido.getCliente().getDevolucoes()>3) {    // Quando o Cliente alcança 3 Devoluções
    				pedido.getCliente().setAtivo(false);
    			} 
    	  }
    		this.quantidadeDeEntregas +=1; 
    		this.totalEntregas += pedido.getValorTotal(); 
    	}
    }
    
    public void receberPagamentoNormal(Pedido pedido) {
    	if(this.entregas.contains(pedido)){
    		  pedido.setSituacao("atendido");
  	    }else{
    	   System.out.println("Esse pedido não consta para este entregador");
        }
    }
    
    
    public void receberPagamentoCheque(Pedido pedido, Cheque cheque) {
    	if(this.entregas.contains(pedido)){
    		  pedido.setCheque(cheque);
    		  pedido.setSituacao("atendido");
  	    }else{
    	   System.out.println("Esse pedido não consta para este entregador");
        }
    }
    
    @Override
    public String toString() {
        String tudo = "";
        for (Pedido entrega : entregas) {
            tudo += entrega.toString() + "\n";
        }
        return tudo;
    }

}