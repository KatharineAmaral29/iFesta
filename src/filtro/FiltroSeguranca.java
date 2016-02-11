package filtro;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.*;

public class FiltroSeguranca implements Filter 
{
   public void init(FilterConfig filterConfig) throws ServletException{}
   public void destroy(){}

   public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException, ServletException{
      HttpServletResponse resp = (HttpServletResponse) response;
      HttpServletRequest req = (HttpServletRequest) request;
      String servletPath = req.getServletPath();

      // Allow access to login functionality.
      if (servletPath.equals("/LoginClienteServlet")) //se tiver sido chamado pelo servlet LoginClienteServlet libera o acesso
      {
         chain.doFilter(req, resp); //permite
         return;
      }
      /*
      // Allow access to news feed.
      // Adicionar as páginas que pode acessar sem login
      if (servletPath.equals("/news.rss")) {
    	  chain.doFilter(req, resp);
    	  return;
      }
      */
      
      // All other functionality requires authentication.
      HttpSession session = ((HttpServletRequest)req).getSession();
      Cliente usuario = (Cliente)session.getAttribute("usuario");
      if (usuario != null)
      {
         // User is logged in.
         chain.doFilter(req, resp);
         return;
      }
      
      // Request is not authorized.
      resp.sendRedirect("https://localhost/iFesta/WebContent/login.jsp");
   }   
}