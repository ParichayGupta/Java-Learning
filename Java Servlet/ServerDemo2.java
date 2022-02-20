import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServerDemo2 extends HttpServlet
{
	public void doGet(HttpServletRequest rq,HttpServletResponse rs)throws IOException,ServletException
	{
		
		PrintWriter out=rs.getWriter();
		
		String s1=rq.getParameter("un");
		String s2=rq.getParameter("up");
		
		out.println("<html>");
		out.println("<body>");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
				 
			String db_url="jdbc:mysql://localhost:3306/Server";
			String db_uname="root";
			String db_upass="root";
				 
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
				 
			Statement st=con.createStatement();
			
			String q="insert into login(UNAME,UPASS) values('"+s1+"','"+s2+"')";
			
			st.executeUpdate(q);
			
			con.close();
		}
		catch(Exception e)
		{
			out.println("<h1> "+e+" </h1>");
		}		
			out.println("<h1>Data Inserted ...</h1>");
			out.println("<h1> Name="+s1+" </h1>");
			out.println("<h1> Pass="+s2+" </h1>");
			out.println("</body>");
			out.println("</html>");
			out.close();
	}
}