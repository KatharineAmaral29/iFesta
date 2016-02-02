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

@WebServlet("/CadastroServicoServlet")
public class CadastroServicoServlet  extends HttpServlet {
	idevento idcliente nome_evento descricao
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		//requisitando paramentros do formulario
		String nomeservico = request.getParameter("nomeservico");
		String descricao = request.getParameter("descricao");
		String regras = request.getParameter("regras");
		String preco = request.getParameter("preco");
		String tipo = request.getParameter("servico");
		String eventos = request.getParameterValues("evento");

		
		//criando Servico
		Servico servico = new Servico();
		servico.setNomeServico(nomeservico);
		servico.setDescricao(descricao);
		servico.setRegras(regras);
		servico.setPreco(preco);
		servico.setTipo(tipo);
		servico.setEventos(eventos);

		EventoDAO cadastrar;
		try {
			cadastrar = new EventoDAO();
			if(cadastrar.insertServico(servico)){
				response.sendRedirect("cadastro-servico.jsp");
			}
			//jsp de erro.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
