package dao;


public class LoginDAO {

	public LoginDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public  boolean validate(String login, String senha){
		ClienteDAO cdao = new ClienteDAO();
		boolean res = false;
		
		if(cdao.findCliente(login, senha) != null){
			res = true;
		}
		
		return res;
	}

}
