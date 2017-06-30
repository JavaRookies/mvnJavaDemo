package nuist.dymvn.ServletDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ServletHelloWorld extends HttpServlet{
	private String massage;
	
	public void init() throws ServletException
	{
		massage = "Hello Servlet";
	}
	
	public void doGet(HttpServletRequest request,
					  HttpServletResponse response)
					  throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>" + massage + "</h1>");
	}
	
	public void destroy()
	{
		
	}
}