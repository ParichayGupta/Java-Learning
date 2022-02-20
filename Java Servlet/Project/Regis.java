import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Regis extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("u1");
		String s2=request.getParameter("u2");
		String s3=request.getParameter("u3");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
				 
			String db_url="jdbc:mysql://localhost:3306/Server";
			String db_uname="root";
			String db_upass="root";
				 
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
				 
			Statement st=con.createStatement();
			
			String q="insert into Regis values('"+s1+"','"+s2+"','"+s3+"')";
			
			st.executeUpdate(q);
			response.sendRedirect("Login.html");
			con.close();
		}
		catch(Exception e)
		{
			out.println("<h1> "+e+" </h1>");
		}
			out.close();
	}
}