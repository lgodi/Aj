import java.*;
import javax.servlet.*;
//import javax.servlet.http.*;

public class HelloServlet implements Servlet
{
	ServletConfig config=null;

	public void init(ServletConfig config)
	{
		this.config=config;
		System.out.println("Servet is Initilize..!");
	}
	public void service(ServletRequest req,ServletResponse res) throws IoException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<b>Hello Servlet..!!</b>");
		out.print("</body></html>");
	}
	public void destroy()
	{
		System.out.println("Serlvet is destroyed..!");
	}
	public ServletConfig getServletConfig()
	{
		return config;
	}
}































	/*
	public String HelloMsg;
	{
		public void init() throws ServletException
		{
			HelloMsg="Hello Servlet";
		}
		public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1>" + HelloMsg + "</h1>");
		}
		public void destory()
		{
		}
	}
}*/

