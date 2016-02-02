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

@WebServlet("/CadastroEventoServlet")
public class CadastroEventoServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		//requisitando paramentros do formulario
		String nomeServico = request.getParameter("nomeevento");
		String dataEvento = request.getParameter("dataevento");
	
		//criando Evento
		Evento evento = new Evento();
		evento.setNome(nomeEvento);
		evento.setData(dataEvento);

		EventoDAO cadastrar;
		try {
			cadastrar = new EventoDAO();
			if(cadastrar.insertEvento(evento)){
				response.sendRedirect("promocoes.jsp");
			}
			//jsp de erro.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
