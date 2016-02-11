package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.FornecedorDAO;
import dao.LoginDAO;
import modelo.Fornecedor;

/**
 * Servlet implementation class LoginFornecedorServlet
 */
@WebServlet("/LoginFornecedorServlet")
public class LoginFornecedorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginFornecedorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		FornecedorDAO fdao = new FornecedorDAO();
		LoginDAO ldao = new LoginDAO();
		Fornecedor f = new Fornecedor();
		
		String login_form = request.getParameter("emailf"); // Pega o Login vindo do formulário
		String senha_form = request.getParameter("senhaf"); //Pega a senha vinda do formulário
		
		if(ldao.validateFornecedor(login_form, senha_form))	{//Caso login e senha estejam corretos...
			System.out.println("Usuario Existe");
			f = fdao.findFornecedor(login_form, senha_form); 				
			session.putValue("loginFornecedor", f.getEmail_fornecedor()); //Grava a session com o Login
			session.putValue("senhaFornecedor", f.getSenha_fornecedor()); //Grava a session com a Senha
			session.putValue("nomeFantasiaFornecedor", f.getNome_fantasia());
			session.putValue("razaoSocialFornecedor", f.getRazao_social());
			session.putValue("enderecoFornecedor", f.getEnderecoComp());
			session.putValue("cnpjFornecedor", f.getCnpj());
			session.putValue("tel1Fornecedor", f.getTelefone1_fornecedor());
			session.putValue("tel2Fornecedor", f.getTelefone2_fornecedor());
			session.putValue("idFornecedor", f.getIdfornecedor());
			session.setAttribute("autorizado", f);
			System.out.println("Logado com sucesso."); //Mostra na tela que foi logado com sucesso
			response.sendRedirect("inicial-empresa.jsp");
		}
			else{ //Se estiverem incorretos...
				System.out.println("Login ou senha inválidos."); //Exibe na tela e pede para voltar
			}
		

	}
	

}
