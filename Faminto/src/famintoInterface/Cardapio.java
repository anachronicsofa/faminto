package famintoInterface;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Cardapio {
	protected String nome;
	protected double preco;

        public Cardapio(String nome, double preco) {
        	this.nome =nome;
        	this.preco = preco;           
        }
      
    	public String getNome() {
    		return nome;
    	}

    	public void setNome(String nome) {
    		this.nome = nome;
    	}
        
    	public double getPreco() {
    		return preco;
    	}

    	public void setPreco(double preco) {
    		this.preco = preco;
    	}

    	 public boolean temEstoque (int q) {
         	return true; 
         }
    	
        @Override
        public String toString() {
            return "| Produto: " + nome + " | Preço: R$ " + preco + "\n ";
        }

}