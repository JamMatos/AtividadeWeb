package aula04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Atividade01 
 */
@WebServlet("/Atividade01")
public class Atividade01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Atividade01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><Body>");
		saida.write("Olá! " + request.getParameter("primeiroNome") + " " + request.getParameter("ultimoNome")+ "!");
		saida.write("</HTML></Body>");
		
		saida.close();
	}

}