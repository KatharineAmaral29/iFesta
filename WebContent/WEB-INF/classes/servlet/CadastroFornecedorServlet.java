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

@WebServlet("/CadastroFornecedorServlet")
public class CadastroFornecedorServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		//requisitando parametros do formulario
		String nomefantasia = request.getParameter("nomefantasia");
		String razaosocial = request.getParameter("razaosocial");
		String cnpj = request.getParameter("cnpj");
		String endereco = request.getParameter("endereco");
		String numero = request.getParameter("numero");
		String cidade = request.getParameter("cidade");
		String telefone1 = request.getParameter("telefone1");
		String telefone2 = request.getParameter("telefone2");
		String email = request.getParameter("email");
		String senha= request.getParameter("senha");
		String plano = request.getParameter("plano");
		
		//criando fornecedor
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNomeFantasia(nomefantasia);
		fornecedor.setRazaoSocial(razaosocial);
		fornecedor.setCNPJ(cnpj);
		fornecedor.setEndereco(endereco);
		fornecedor.setNumero(numero);
		fornecedor.setCidade(cidade);
		fornecedor.setTelefone1(telefone1);
		fornecedor.setTelefone2(telefone2);
		fornecedor.setEmail(email);
		fornecedor.setSenha(senha);
		fornecedor.setPlano(plano);
	
		// criando sessão
		HttpSession session = request.getSession(true);
		session.setAttribute("autorizado", fornecedor);

		FornecedorDAO cadastrar;
		try {
			cadastrar = new FornecedorDao();
			if(cadastrar.insertFornecedor(fornecedor)){
				response.sendRedirect("inicial-empresa.jsp");
			}
			//jsp de erro.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
}
