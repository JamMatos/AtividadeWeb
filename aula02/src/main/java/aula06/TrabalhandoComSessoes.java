package aula06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TrabalhandoComSessoes
 */
@WebServlet("/TrabalhandoComSessoes")
public class TrabalhandoComSessoes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrabalhandoComSessoes() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter resposta = response.getWriter();
    	
    	String nomeUsuario = request.getParameter("nome");
    	String sobrenomeUsuario = request.getParameter("sobrenome");
    	String enderecoUsuario = request.getParameter("endereco residencial");
    	String ruaUsuario = request.getParameter("rua");
    	String complementoUsuario = request.getParameter("complemento");
    	String cidadeUsuario = request.getParameter("cidade");
    	String cepUsuario = request.getParameter("cep");
    	String estadoUsuario = request.getParameter("estado");
    	
    	HttpSession sessao = request.getSession();
    	sessao.setAttribute("nome", nomeUsuario);
    	sessao.setAttribute("sobrenome", sobrenomeUsuario);
    	sessao.setAttribute("endereco residencial", enderecoUsuario);
    	sessao.setAttribute("rua", ruaUsuario);
    	sessao.setAttribute("complemento", complementoUsuario);
    	sessao.setAttribute("cidade", cidadeUsuario);
    	sessao.setAttribute("cep", cepUsuario);
    	sessao.setAttribute("estado", estadoUsuario);
    	
    	resposta.write("<html><head>");
    	resposta.write("<title>Dados Profissionais</title>");
        resposta.write("</head>");
        resposta.write("<body>");
        resposta.write("Preencha seus dados profissionais:");
        resposta.write("<form action=\"ServletTela2Cadastro\" method=\"post\">");
        resposta.write("Empresa:<input type=\"text\" name=\"empresa\"> <BR>");
        resposta.write("Endereço profissional:<input type=\"text\" name=\"endereco empresa\"> <br>");
        resposta.write("Rua: <input type=\"text\" name=\"rua empresa\">");
        resposta.write("Complemento:<input type=\"text\" name=\"complemento empresa\"><BR>");
        resposta.write("Cidade:<input type=\"text\" name=\"cidade empresa\">");
        resposta.write("CEP:<input type=\"text\" name=\"cep empresa\">");
        resposta.write("Estado:<input type=\"text\" name=\"estado empresa\"><BR>");
        resposta.write("<input type=\"submit\" value=\"Confirmar\"><BR>");
        resposta.write("</form>");
        resposta.write("</body></html>");
    	
    }
    
   	
}

