import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Prac extends HttpServlet
{
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String unm;
		ServletConfig con = getServletConfig();
		unm=con.getInitParameter("name");
		pw.println("username is:"+unm);
	}
}