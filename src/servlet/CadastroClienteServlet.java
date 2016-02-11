package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClienteDAO;
import dao.DAO;
import modelo.Cliente;

/**
 * Servlet implementation class CadastroClienteServlet
 */
@WebServlet("/CadastroClienteServlet")
public class CadastroClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//requisitando paramentros do formulario
		String nome = request.getParameter("nomecompleto");
		String email = request.getParameter("email");
		String senha = request.getParameter("password");
		String cpf = request.getParameter("cpf");
		String sexo = request.getParameter("sexo");
		//String data = request.getParameter("data");
		String telefone = request.getParameter("telefone");
		String celular = request.getParameter("celular");
		String cep = request.getParameter("cep");
		String endereco = request.getParameter("endereco");
		String numero = request.getParameter("numero");
		String complemento = request.getParameter("complemento");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		String pais = request.getParameter("pais");

		//criando Usuário
		Cliente cliente = new Cliente();
		cliente.setNomeCliente(nome);
		cliente.setLogin_cliente(email);
		cliente.setSenha_cliente(senha);
		cliente.setCpf(cpf);
		cliente.setSexo_cliente(sexo);
		//cliente.setData(data);
		cliente.setTelefone1_cliente(telefone);
		cliente.setTelefone2_cliente(celular);
		cliente.setCep_cliente(cep);
		cliente.setRua_cliente(endereco);
		cliente.setNumero_cliente(numero);
		cliente.setComplemento_cliente(complemento);
		cliente.setCidade_cliente(cidade);
		cliente.setEstado_cliente(estado);
		cliente.setPais_cliente(pais);
		
		System.out.println("Cliente criado");
		
		// criando sessão
		HttpSession session = request.getSession(true);
		session.setAttribute("autorizado", cliente);
		session.putValue("loginUsuario", cliente.getLogin_cliente()); //Grava a session com o Login
		session.putValue("senhaUsuario", cliente.getSenha_cliente()); //Grava a session com a Senha
		session.putValue("nomeUsuario", cliente.getNomeCliente());
		session.putValue("cpfUsuario", cliente.getCpf());
		session.putValue("enderecoUsuario", cliente.getEnderecoComp());
		session.putValue("cepUsuario", cliente.getCep_cliente());
		session.putValue("tel1Usuario", cliente.getTelefone1_cliente());
		session.putValue("tel2Usuario", cliente.getTelefone2_cliente());
		session.putValue("idCliente", cliente.getIdcliente());
		System.out.println("Criou sessão");		
		try {
			DAO cadastrar = new DAO();
			if(cadastrar.inserir(cliente)){
				System.out.println("Inseriu no BD");
				response.sendRedirect("inicial-cliente.jsp");
			}
			//jsp de erro.
		} catch (IOException e) {
			System.out.println("entrou no catch");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
