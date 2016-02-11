package dao;

import conexao.Conexao;
import modelo.Fornecedor;

public class LoginDAO extends Conexao{

	public LoginDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public  boolean validateCliente(String login, String senha){
		ClienteDAO cdao = new ClienteDAO();
		boolean res = false;
		
		if(cdao.findCliente(login, senha) != null){
			res = true;
		}
		
		return res;
	}
	
	public  boolean validateFornecedor(String login, String senha){
		FornecedorDAO fdao = new FornecedorDAO();
		boolean res = false;
		
		if(fdao.findFornecedor(login, senha) != null){
			res = true;
		}
		
		return res;
	}

}
