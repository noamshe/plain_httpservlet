import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class HelloServlet extends HttpServlet {
 
	protected void service(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException {
	    resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();		
	    out.println("<HTML>");
	    out.println("<BODY>");
	    out.println("Hello World !!!");
	    out.println("</HTML>");
	    out.println("</BODY>");
	}
 
}
