package br.com.encontos.model;

import java.util.ArrayList;
import java.util.List;

public class SistemaEncontros {

	private List<Encontro> encontros = new ArrayList<Encontro>();
	
	public void adicionar(Encontro e) {
		encontros.add(e);
		
	}
	
	public List<Encontro> listar(){
		return encontros;
	}
	
}
