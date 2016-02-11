package dao;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import modelo.*;

public class DAO {
	ClienteDAO cdao;
	EventoDAO edao;
	FornecedorDAO fdao;
	ServicoDAO sdao;
	LoginDAO ldao;
	
	public DAO() {
		cdao = new ClienteDAO();
		edao = new EventoDAO();
		fdao = new FornecedorDAO();
		sdao = new ServicoDAO();
		ldao = new LoginDAO();
	}
		
	public boolean inserir(Cliente c){
		boolean resultado = false;
		
		if(cdao.insertCliente(c)){
			resultado=true;
		}
		return resultado;
	}
	
	public boolean inserir(Evento e){
		boolean resultado = false;
		
		if(edao.insertEvento(e))
			resultado=true;
		
		//Adicionar o Evento tbm na lista de eventos do Cliente da Secção
		//cliente.adicionarEvento(e);
		
		return resultado;
	}
	
	public boolean inserir(Servico s){
		boolean resultado = false;
		
		if(sdao.insertServico(s))
			resultado=true;
		
		return resultado;
	}
	
	public boolean inserir(Fornecedor f){
		boolean resultado = false;
		
		if(fdao.insertFornecedor(f))
			resultado=true;
		
		return resultado;
	}
	
	public void update (){
		//Fazer o update no banco, de dados de fornecedor ou cliente
	}
	
	public void meusEventos(int id,HttpServletRequest request){
		
		
		request.getSession().setAttribute("meusEventos", edao.findEvento(id));
		
	}

}
