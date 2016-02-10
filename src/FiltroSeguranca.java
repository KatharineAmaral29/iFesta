import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import modelo.*;

@WebFilter("/FiltroSeguranca")
public class FiltroSeguranca implements Filter {

    public FiltroSeguranca() {

    }
	public void destroy() {}
    public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws IOException, ServletException {

        HttpSession session = ((HttpServletRequest)req).getSession();
        Cliente usuario = (Cliente)session.getAttribute("usuario");
        if(usuario==null){
              session.setAttribute("msg","Você não está logado no sistema!");
              ((HttpServletResponse)res).sendRedirect("../login.jsp");
        }else{
              chain.doFilter(req, res);
        }
  }
	public void init(FilterConfig fConfig) throws ServletException {}
}
