import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CadastroEventoServlet")
public class CadastroEventoServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		//requisitando paramentros do formulario
		String nomeEvento = request.getParameter("nomeevento");
		String dataEvento = request.getParameter("dataevento");
	
		//criando Evento
		Evento evento = new Evento();
		evento.setNome(nomeEvento);
		evento.setData(dataEvento);

		// criando sessão
		HttpSession session = request.getSession(true);
		session.setAttribute("autorizado", cliente);

		EventoDAO cadastrar;
		try {
			cadastrar = new EventoDAO();
			if(cadastrar.insertEvento(evento)){
				response.sendRedirect("inicial-cliente.jsp");
			}
			//jsp de erro.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
