package modelo;

import java.util.ArrayList;

public class Carrinho {
	
	ArrayList<Servico> servicos = new ArrayList<>();
	int idevento;
	boolean status_pag;
	int qtd_produtos;

	public Carrinho() {

	}
	
	public Carrinho meuCarrinho(){
		return this;
	}
	
	public int getQuantidadeDeServico(){
		return servicos.size();
	}

}
