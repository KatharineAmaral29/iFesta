package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Cliente;

/**
 * Servlet implementation class LoginClienteServlet
 */
@WebServlet("/LoginClienteServlet")
public class LoginClienteServlet extends HttpServlet {
	public String login = "katharines2@hotmail.com";
	public String senha = "12345";
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
		
		String login_form = request.getParameter("emailc"); // Pega o Login vindo do formulário
		String senha_form = request.getParameter("senhac"); //Pega a senha vinda do formulário
		if(login_form.equals(login) && senha_form.equals(senha)){ //Caso login e senha estejam corretos...
			System.out.println("Logado com sucesso."); //Mostra na tela que foi logado com sucesso
			Cliente c = new Cliente();
			c.setLogin_cliente(login_form);
			c.setSenha_cliente(senha_form);
			session.putValue("loginUsuario", login); //Grava a session com o Login
			session.putValue("senhaUsuario", senha); //Grava a session com a Senha
			session.setAttribute("autorizado", c);
		}
		else{ //Se estiverem incorretos...
			System.out.println("Login ou senha inválidos."); //Exibe na tela e pede para voltar
		}

	}

}
