import java.io.*;
import javax.servlet.*;
//import javax.servlet.http.*;

public class Hello implements Servlet
{
	ServletConfig config=null;

	public void init(ServletConfig config)
	{
		this.config=config;
		System.out.println("Servet is Initilize..!");
	}
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<b>Hello Servlet..!!</b>");
		out.print("</body></html>");
	}
	public void destroy()
	{
		System.out.println("Serlvet is destroyed..!!");
	}
	public ServletConfig getServletConfig()
	{
		return config;
	}
}