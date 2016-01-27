import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDao;
import modelo.Usuario;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		// requisitando paramentros do formulario
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		if (email == "" && senha == "") {
			response.sendRedirect("index.html");
		} else {

			System.out.println("sevlet" + senha);
			LoginDao login;
			try {
				login = new LoginDao();
				Usuario usuario = login.logar(email, senha);
				System.out.println(usuario.getNome());

				if (usuario.getNome() != null) {
					usuario.setSenha(senha);
					usuario.setEmail(email);

					// criando sessão:
					HttpSession session = request.getSession(true);
					session.setAttribute("autorizado", usuario);
					response.sendRedirect("home2.jsp");
					// redirecionar:

				}else{
					response.sendRedirect("cadastro.html");
				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//fim do else
}
