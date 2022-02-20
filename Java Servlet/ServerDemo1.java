import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServerDemo1 extends HttpServlet
{
	public void doGet(HttpServletRequest rq,HttpServletResponse rs) throws IOException,ServletException
	{
		PrintWriter out=rs.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}