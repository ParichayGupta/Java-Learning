import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("u1");
		String s2=request.getParameter("u2");
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
				 
			String db_url="jdbc:mysql://localhost:3306/Server";
			String db_uname="root";
			String db_upass="root";
				 
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
				 
			Statement st=con.createStatement();
			
			String q="select * from regis where UNAME='"+s1+"' AND UPASS='"+s2+"' ";
			
			ResultSet rs=st.executeQuery(q);
			
			if(rs.next())
			{
				response.sendRedirect("Menu.html");
			}
			else
			{
				out.println("<h1> Invalid UserName and Password </h1>");
			}
			con.close();
		}
		catch(Exception e)
		{
			out.println("<h1> "+e+" </h1>");
		}
			out.close();
	}
}