package dao;

import modelo.*;

public class DAO {
	ClienteDAO cdao = new ClienteDAO();
	EventoDAO edao = new EventoDAO();
	FornecedorDAO fdao = new FornecedorDAO();
	ServicoDAO sdao = new ServicoDAO();
	LoginDAO ldao = new LoginDAO();
	
	
	public boolean inserir(Cliente c){
		boolean resultado = false;
		
		cdao.insertCliente(c);
		
		return resultado;
	}
	
	public boolean inserir(Evento e){
		boolean resultado = false;
		
		edao.insertEvento(e);
		//Adicionar o Evento tbm na lista de eventos do Cliente da Secção
		//cliente.adicionarEvento(e);
		
		return resultado;
	}
	
	public boolean inserir(Servico s){
		boolean resultado = false;
		
		sdao.insertServico(s);
		
		return resultado;
	}
	
	public boolean inserir(Fornecedor f){
		boolean resultado = false;
		
		fdao.insertFornecedor(f);
		
		return resultado;
	}
	
	public void update (){
		//Fazer o update no banco, de dados de fornecedor ou cliente
	}

}
