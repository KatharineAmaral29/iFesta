package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClienteDAO;
import dao.DAO;
import dao.EventoDAO;
import dao.LoginDAO;
import modelo.Cliente;
import modelo.Evento;

@WebServlet("/LoginClienteServlet")
public class LoginClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginClienteServlet() {
        super();
    }

	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		ClienteDAO cdao = new ClienteDAO();
		LoginDAO ldao = new LoginDAO();
		EventoDAO edao = new EventoDAO();
		Cliente c = new Cliente();
		Evento e;
		
		String login_form = request.getParameter("emailc"); // Pega o Login vindo do formulário
		String senha_form = request.getParameter("senhac"); //Pega a senha vinda do formulário
		
		if(ldao.validateCliente(login_form, senha_form))	{//Caso login e senha estejam corretos...
			System.out.println("Usuario Existe");
			c = cdao.findCliente(login_form, senha_form); 				
			session.putValue("loginUsuario", c.getLogin_cliente()); //Grava a session com o Login
			session.putValue("senhaUsuario", c.getSenha_cliente()); //Grava a session com a Senha
			session.putValue("nomeUsuario", c.getNomeCliente());
			session.putValue("cpfUsuario", c.getCpf());
			session.putValue("enderecoUsuario", c.getEnderecoComp());
			session.putValue("cepUsuario", c.getCep_cliente());
			session.putValue("tel1Usuario", c.getTelefone1_cliente());
			session.putValue("tel2Usuario", c.getTelefone2_cliente());
			session.putValue("idCliente", c.getIdcliente());
			session.setAttribute("autorizado", c);
			session.setAttribute("eventos", edao.findEvento(c.getIdcliente()));
			
		
			System.out.println("Logado com sucesso."); //Mostra na tela que foi logado com sucesso
			response.sendRedirect("inicial-cliente.jsp");
		}
			else{ //Se estiverem incorretos...
				System.out.println("Login ou senha inválidos."); //Exibe na tela e pede para voltar
			}
		

	}

}
