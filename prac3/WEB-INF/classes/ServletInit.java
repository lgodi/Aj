import javax.servlet.*;
import java.io.*;
import java.util.*;
import javax.servlet.http.*;

public class ServletInit extends HttpServlet
{
	ServletConfig config=null;
	String uname;

	public void init(ServletConfig config)throws ServletException
	{
	 	this.config=config;
	 	System.out.println("Servlet initilized");
	}
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<b>Hello Servlet</b>");
		out.print("</body></html>");
		Set BackgroundColor="red";
	}
	public void destroy()
	{
		System.out.println("servlet is destroyed");
	}
	public ServletConfig getServletConfig()
	{
		return config;
	}
	public String getServletInfo()
	{
		return "";
	}
}





















/*public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	 	{
		  	response.setContentType("text/html");

		       PrintWriter out = response.getWriter();
		 	  String uname;
		 	  servletconfig
		       String docType= "\n";
		       out.println(docType +"\n" + "User Name: "+request.getParameter("UserName") "");
	} */