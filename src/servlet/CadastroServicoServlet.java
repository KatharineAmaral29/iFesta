package servlet;

import java.io.IOException;
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
		int tipoevento = Integer.parseInt(request.getParameter("evento"));
		float preco = Float.parseFloat(request.getParameter("preco"));
		String regras = request.getParameter("regras");
		
		//criando Servico
		Servico servico = new Servico();
		servico.setIdfornecedor(1); 		// TROCAR PELO ID DO FORNECEDOR QUE ESTIVER LOGADO
		servico.setNomeServico(nome);
		servico.setDescricao(descricao);
		servico.setTipo_servico(tiposervico);
		servico.setPreco_servico(preco);
		servico.setRegras_servico(regras);


		ServicoDAO cadastrar;
		try {
			cadastrar = new ServicoDAO();
			if(cadastrar.insertServico(servico)){
				response.sendRedirect("cadastro-servico.jsp");
			}
			//jsp de erro.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
