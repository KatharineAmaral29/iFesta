import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.swing.JScrollBar;

import modelo.Cliente;


@WebServlet("/CadastroClienteServlet")
public class CadastroClienteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		System.out.println("Entrou no Get");
		//requisitando paramentros do formulario
		String nome = request.getParameter("nomecompleto");
		String email = request.getParameter("email");
		String senha = request.getParameter("password");
		String cpf = request.getParameter("cpf");
		String sexo = request.getParameter("sexo");
		String data = request.getParameter("data");
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
		
		System.out.println("Criou CLiente");
		
		// criando sessão
		HttpSession session = request.getSession(true);
		session.setAttribute("autorizado", cliente);
		
		System.out.println("passou HTTP");

		ClienteDAO cadastrar;
		try {
			cadastrar = new ClienteDAO();
			System.out.println("Entrou no TRY");
			if(cadastrar.insertCliente(cliente)){
				System.out.println("Entrou no IF");
				response.sendRedirect("inicial-cliente.jsp");
			}
			//jsp de erro.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Entrou no CATCH");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Entrou no CATCH");
			e.printStackTrace();
		}
	}

	
}
