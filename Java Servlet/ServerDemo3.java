import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ServerDemo3 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("un");
		String s2=request.getParameter("up");
		
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
			
			String q="Select * from login";
			
			ResultSet rs=st.executeQuery(q);
			while(rs.next())
			{
			out.println("<h1> "+rs.getString(1)+" </h1>");
			out.println("<h1> "+rs.getString(2)+" </h1>");
			}
			con.close();
		}
		catch(Exception e)
		{
		}		
			out.println("<h1>Data Inserted ...</h1>");
			out.println("<h1> Name="+s1+" </h1>");
			out.println("<h1> Pass="+s2+" </h1>");
			out.println("</body>");
			out.println("</html>");
			out.close();
	}
}