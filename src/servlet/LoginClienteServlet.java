package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClienteDAO;
import dao.LoginDAO;
import modelo.Cliente;

/**
 * Servlet implementation class LoginClienteServlet
 */
@WebServlet("/LoginClienteServlet")
public class LoginClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		ClienteDAO cdao = new ClienteDAO();
		LoginDAO ldao = new LoginDAO();
		Cliente c = new Cliente();
		
		String login_form = request.getParameter("emailc"); // Pega o Login vindo do formulário
		String senha_form = request.getParameter("senhac"); //Pega a senha vinda do formulário
		
		if(ldao.validate(login_form, senha_form))	{//Caso login e senha estejam corretos...
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
			session.setAttribute("autorizado", c);
			System.out.println("Logado com sucesso."); //Mostra na tela que foi logado com sucesso
			response.sendRedirect("http://localhost:11213/iFesta/index.jsp");
		}
			else{ //Se estiverem incorretos...
				System.out.println("Login ou senha inválidos."); //Exibe na tela e pede para voltar
			}
		

	}

}
