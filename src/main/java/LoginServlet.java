
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginServlet")
/**
* Servlet implementation class LoginServlet
*/
public class LoginServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
 
public LoginServlet() {
 super();
 // TODO Auto-generated constructor stub
 }
 protected void doPost (HttpServletRequest request, HttpServletResponse response)
 String emailid = request.getParameter("emailid");
 String password = request.getParameter("password");
 PrintWriter out=response.getWriter();
if (emailid != null && emailid.equalsIgnoreCase("SK123@gmail.com") && password != 
null && password.equalsIgnoreCase("SK")) {
out.println("emailid.." + emailid);
 out.println("password.." + password); 
 }
else {
out.print("invalid");
}
 }
}