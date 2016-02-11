package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import javax.servlet.*;

import dao.*;
import modelo.*;
import conexao.*;

@WebServlet("/CadastroEventoServlet")
public class CadastroEventoServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		//requisitando paramentros do formulario
		String nomeEvento = request.getParameter("nomeevento");
		String dataEvento = request.getParameter("dataevento");
		String descricaoEvento = request.getParameter("descricao");
		String tipoEvento = request.getParameter("tipoevento");
	
		//criando Evento
		Evento evento = new Evento();
		evento.setNome_evento(nomeEvento);
		evento.setData(dataEvento);
		evento.setDescricao(descricaoEvento);
		evento.setTipo(Integer.valueOf(tipoEvento));
		evento.setIdcliente((Integer)request.getSession().getAttribute("idCliente")); // TROCAR PELO ID DO USUÁRIO QUE ESTIVER LOGADO

		DAO cadastrar;
		try {
			cadastrar = new DAO();
			if(cadastrar.inserir(evento)){
				response.sendRedirect("listaservico.jsp");
			}
			//jsp de erro.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
