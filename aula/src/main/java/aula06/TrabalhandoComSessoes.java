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
 * Servlet implementation class ServletTela1Cadastro
 */
@WebServlet("/ServletTela1Cadastro")
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
    	
    	resposta.write("<html><body>");
        
    	String nomeUsuario = request.getParameter("nome");
    	String sobrenomeUsuario = request.getParameter("sobrenome");
    	String enderecoUsuario = request.getParameter("endereco residencial");
    	String ruaUsuario = request.getParameter("rua");
    	String complementoUsuario = request.getParameter("complemento");
    	String cidadeUsuario = request.getParameter("cidade");
    	String cepUsuario = request.getParameter("cep");
    	String estadoUsuario = request.getParameter("estado");
    	
    	if (autentica(nomeUsuario,sobrenomeUsuario,enderecoUsuario, ruaUsuario, complementoUsuario, cidadeUsuario, cepUsuario, estadoUsuario)) {
    		HttpSession sessao = request.getSession();
    		sessao.setAttribute(nomeUsuario, nomeUsuario);
    		
    		resposta.write("Bem vindo " + nomeUsuario);
    		resposta.write(enderecoUsuario + ruaUsuario + complementoUsuario + cidadeUsuario + cepUsuario + estadoUsuario);
    	}
    	
    	resposta.write("</body></html>");
    }
    
    private boolean autentica(String usuario, String sobrenome, String endereco, String rua, String complemento, String cidade, String cep, String estado) {
		// Aqui entra o código de autenticação
		// Aqui você deve acessar o banco de dados e verificar se o usuário e senha estão corretos.
		if (!usuario.equals("") && usuario != null && sobrenome != null && !sobrenome.equals("")) {
			return true;
		}
		return false;
    }
   	
}