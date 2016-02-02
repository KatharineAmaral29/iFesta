import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.*;
import modelo.*;
import conexao.*;
import servlet.*;

@WebServlet("/LoginFornecedorServlet")
public class LoginFornecedorServlet  extends HttpServlet {
	public String login = "KatharineFornecedor";
	public String senha = "12345";

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {	
		String login_form = request.getParameter("emailf"); // Pega o Login vindo do formulário
		String senha_form = request.getParameter("senhaf"); //Pega a senha vinda do formulário
		if(login_form.equals(login) && senha_form.equals(senha)){ //Caso login e senha estejam corretos...
			out.println("Logado com sucesso."); //Mostra na tela que foi logado com sucesso
			session.putValue("loginUsuario", login); //Grava a session com o Login
			session.putValue("senhaUsuario", senha); //Grava a session com a Senha
			out.println("<script>document.location.href='logado.jsp';</script>"); //Exibe um código javascript para redireionar ao painel
		}
		else{ //Se estiverem incorretos...
			out.println("Login ou senha inválidos. <a href='java script:back()'>Voltar</a>"); //Exibe na tela e pede para voltar
		}
}
