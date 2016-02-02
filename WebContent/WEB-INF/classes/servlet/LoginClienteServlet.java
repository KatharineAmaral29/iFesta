import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDao;
import modelo.Usuario;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String email=request.getParameter("emailc");  
	    String senha=request.getParameter("senhac");  
	          
	    if(LoginDao.validate(email, senha)){  
	        RequestDispatcher rd=request.getRequestDispatcher("inicial-cliente.jsp");  
	        rd.forward(request,response);  
	    }  
	    else{  
	        out.print("Login ou senha com erro");  
	        RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
	        rd.include(request,response);  
	    }  
	          
	    out.close();  
	    }
}
