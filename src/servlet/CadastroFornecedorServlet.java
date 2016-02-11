package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.*;
import modelo.*;

/**
 * Servlet implementation class CadastroFornecedorServlet
 */
@WebServlet("/CadastroFornecedorServlet")
public class CadastroFornecedorServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroFornecedorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//requisitando paramentros do formulario
		String nomefantasia = request.getParameter("nomefantasia");
		String razaosocial = request.getParameter("razaosocial");
		String cnpj = request.getParameter("cnpj");
		String rua = request.getParameter("rua");
		String numero = request.getParameter("numero");
		String cep = request.getParameter("cep");
		String bairro = request.getParameter("bairro");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		String pais = request.getParameter("pais");
		String telefone1 = request.getParameter("telefone1");
		String telefone2 = request.getParameter("telefone2");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String plano = request.getParameter("plano");
		
		//criando Fornecedor
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome_fantasia(nomefantasia);
		fornecedor.setRazao_social(razaosocial);
		fornecedor.setCnpj(cnpj);
		fornecedor.setRua_fornecedor(rua);
		fornecedor.setNumero_fornecedor(numero);
		fornecedor.setCep_fornecedor(cep);
		fornecedor.setBairro_fornecedor(bairro);
		fornecedor.setCidade_fornecedor(cidade);
		fornecedor.setEstado_fornecedor(estado);
		fornecedor.setPais_fornecedor(pais);
		fornecedor.setTelefone1_fornecedor(telefone1);
		fornecedor.setTelefone2_fornecedor(telefone2);
		fornecedor.setEmail_fornecedor(email);
		fornecedor.setSenha_fornecedor(senha);
		fornecedor.setPlano_fornecedor(fornecedor.conversaoPlanos(plano));
		
		System.out.println("Fornecedor criado");
		
		// criando sessão
		HttpSession session = request.getSession(true);
		session.setAttribute("autorizado", fornecedor);
				
		try {
			DAO cadastrar = new DAO();
			if(cadastrar.inserir(fornecedor)){
				response.sendRedirect("inicial-empresa.jsp");
			}
			//jsp de erro.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
