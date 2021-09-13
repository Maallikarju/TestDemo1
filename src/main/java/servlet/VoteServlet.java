package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class VoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
                @Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			HttpSession session=request.getSession();
			PrintWriter out=response.getWriter();
			String Name=request.getParameter("name");
			int Age=Integer.parseInt(request.getParameter("age"));
			session.setAttribute("name",Name);
			session.setAttribute("age", Age);
			if (Age<=17)
			{
				out.println("<html>"
				+"<body><center>"
				+"<h1 style=\"background-color: red; color:yellow;\">Hi "+Name+" <br>You are not Eligible for voting</h1>"
				+"</center></body>"
				+"</html>");
			} else {
				out.println("<html>"
						+"<body><center>"
						+"<h1 style=\"background-color: green; color:yellow;\">Hi "+Name+" <br>You are Eligible for voting</h1>"
						+"</center></body>"
						+"</html>");
			}
		}

	}


