package aula05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTela2Cadastro
 */
@WebServlet("/ServletTela2Cadastro")
public class ServletTela2Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela2Cadastro() {
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
    	
    	HttpSession sessao = request.getSession();
    	String nomeUsuario = (String) sessao.getAttribute("nome");
    	String sobrenomeUsuario = (String) sessao.getAttribute("sobrenome");
    	String enderecoUsuario = (String) sessao.getAttribute("endereco residencial");
    	String ruaUsuario = (String) sessao.getAttribute("rua");
    	String complementoUsuario = (String) sessao.getAttribute("complemento");
    	String cidadeUsuario = (String) sessao.getAttribute("cidade");
    	String cepUsuario = (String) sessao.getAttribute("cep");
    	String estadoUsuario = (String) sessao.getAttribute("estado");
    	String empresa = request.getParameter("empresa");
    	String enderecoEmpresa = request.getParameter("endereco empresa");
    	String ruaEmpresa = request.getParameter("rua empresa");
    	String complementoEmpresa = request.getParameter("complemento empresa");
    	String cidadeEmpresa = request.getParameter("cidade empresa");
    	String cepEmpresa = request.getParameter("cep empresa");
    	String estadoEmpresa = request.getParameter("estado empresa");
    	
    	resposta.write("<html><head>");
        resposta.write("<title>Confirmação de registro</title>");
        resposta.write("</head>");
        resposta.write("<body>");
        resposta.write("<h3>Registro realizado com sucesso!</h3><br/><br/>");
        resposta.write("<b>Seus dados pessoais:</b><br/>");
        resposta.write("Nome: " + nomeUsuario + "Sobrenome: " + sobrenomeUsuario);
        resposta.write("<br/>");
        resposta.write("Rua: "+ ruaUsuario);
        resposta.write("<br/>");
        resposta.write("Complemento: " + complementoUsuario);
        resposta.write("<br/>");
        resposta.write("Cidade: " + cidadeUsuario);
        resposta.write(", ");
        resposta.write("Cep: " + cepUsuario);
        resposta.write(", ");
        resposta.write("Estado: "+ estadoUsuario);
        resposta.write("<br/>");
        resposta.write("<b>Seus dados profissionais:</b><br/>");
        resposta.write("Empresa: "+ empresa);
        resposta.write("<br/>");
        resposta.write("Rua da empresa: " + ruaEmpresa);
        resposta.write("<br/>");
        resposta.write("Complemento da empresa: "+ complementoEmpresa);
        resposta.write("<br/>");
        resposta.write("Cidade da empresa: "+ cidadeEmpresa);
        resposta.write(", ");
        resposta.write("CEP da empresa: " + cepEmpresa);
        resposta.write(", ");
        resposta.write("Estado da empresa: " + estadoEmpresa);
    	
    	resposta.write("</body></html>");
        

    }

}
