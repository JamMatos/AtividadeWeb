package aula4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCalculadora
 */
@WebServlet("/ServletCalculadora")
public class ServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		String x;
		String y;
		
		x = request.getParameter("numero1");
		y = request.getParameter("numero2");
		saida.write("<HTML><Body>");
		saida.write(request.getParameter("numero1") + " + " + request.getParameter("numero2") + " = " + (x+y));
		saida.write("</HTML></Body>");
		
		saida.close();

	}

}
