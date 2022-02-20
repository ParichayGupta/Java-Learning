import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Search extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		
		PrintWriter out=response.getWriter();
		
		String s1=request.getParameter("u1");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
				 
			String db_url="jdbc:mysql://localhost:3306/Server";
			String db_uname="root";
			String db_upass="root";
				 
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
				 
			Statement st=con.createStatement();
			
			String q="Select * from user where RNO='"+s1+"'";
			
			ResultSet rs=st.executeQuery(q);
			
			if(rs.next())
			{
				out.println("<html><head><link rel='stylesheet' href='abc.css'></head>");
				out.println("<body>");
				out.println("<div id='mymenu'>");
				out.println("<ul>");
				out.println("<li> Home </li>");
				out.println("<li><a href='Insert.html'> Insert </a></li>");
				out.println("<li><a href='Showall'> Showall </a> </li>");
				out.println("<li><a href='Update.html'> Update </a> </li>");
				out.println("<li><a href='Delete.html'> Delete </a> </li>");
				out.println("<li><a href='Search.html'> Search </a> </li>");
				out.println("<li> About us </li>");
				out.println("<li> Contact us </li>");
				out.println("</ul>");
				out.println("</div>");

				out.println("<div id='mydata'>");
				out.println("<center>");
				out.println("<table border='1' cellpadding='15'>");
				out.println("<tr>");
				out.println("<th> Roll No </th>");
				out.println("<th> Name </th>");
				out.println("<th> Physics </th>");
				out.println("<th> Chemistry </th>");
				out.println("<th> Maths </th>");
				out.println("</tr>");
		
				out.println("<tr>");
				out.println("<td> "+rs.getString(1)+" </td>");
				out.println("<td> "+rs.getString(2)+" </td>");
				out.println("<td> "+rs.getString(3)+" </td>");
				out.println("<td> "+rs.getString(4)+" </td>");
				out.println("<td> "+rs.getString(5)+" </td>");
				out.println("</tr>");
				
				
				out.println("</table>");
				out.println("</div>");
				out.println("</center>");
				out.println("</body>");
				out.println("</html>");
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