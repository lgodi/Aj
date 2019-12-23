import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Color extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
  	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname;
		servletconfig
	    String docType= "\n";
		System.out.println(docType +"\n" + "User Name: "+request.getParameter("UserName") "");
	}
}