package br.com.encontos.model;

import java.util.Date;

public class Encontro {
	
	private String nomePessoa;
	private String local;
	private Date data;
	private String motivo;
	
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getLocal() {
		return local;
	}
}