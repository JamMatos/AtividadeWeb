package br.com.encontos.model;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
	
	private static final String SISTEMA_ENCONTROS = "sistemasEncontros";
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		context.setAttribute(SISTEMA_ENCONTROS, new SistemaEncontros());
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		
	}
}