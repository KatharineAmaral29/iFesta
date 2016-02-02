package dao;
import modelo.*;

public class LoginDAO {

	public LoginDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public  Cliente validate(String login, String senha){
		ClienteDAO cdao = new ClienteDAO();
		Cliente c = new Cliente();
		
		c = cdao.findCliente(login, senha);		
		
		return c;
	}

}
