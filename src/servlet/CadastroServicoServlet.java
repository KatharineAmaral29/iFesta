package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.*;
import modelo.*;

@WebServlet("/CadastroServicoServlet")
public class CadastroServicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CadastroServicoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//requisitando paramentros do formulario
		String nome = request.getParameter("nomeservico");
		String descricao = request.getParameter("descricao");
		int tiposervico = Integer.parseInt(request.getParameter("servico"));
		String[] tipoevento; //vetor para passar as strings com os tipos de evento selecionados
		tipoevento = request.getParameterValues("evento");
		float preco = Float.parseFloat(request.getParameter("preco"));
		String regras = request.getParameter("regras");
		ArrayList<Integer> evento = new ArrayList<Integer> (); //arraylist com os id dos eventos selecionados
		ArrayList<Boolean> aux = new ArrayList<>();
		for(int i=0;i<tipoevento.length;i++)
			evento.add(Integer.parseInt(tipoevento[i]));
		
		//criando Servico
		Servico servico = new Servico();
		servico.setIdfornecedor(2); 		// TROCAR PELO ID DO FORNECEDOR QUE ESTIVER LOGADO
		servico.setNomeServico(nome);
		servico.setDescricao(descricao);
		servico.setTipo_servico(tiposervico);
		servico.setPreco_servico(preco);
		servico.setRegras_servico(regras);
		aux = servico.getTipo_eventos();
		for(int i = 0;i<evento.size();i++){
			aux.set((evento.get(i)-1), true);
		}
		servico.setTipo_eventos(aux);


		DAO cadastrar;
		try {
			cadastrar = new DAO();
			if(cadastrar.inserir(servico)){
				response.sendRedirect("cadastro-servico.jsp");
			}
			//jsp de erro.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
