package br.edu.ifma.padroes.composite.model;

import br.edu.ifma.padroes.composite.interfaces.Componente;

public class Celula implements Componente {
	
	private String conteudo;
	
	public Celula() {
		
	}
	
	public Celula(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public void imprimir() {
		
		this.conteudo = this.conteudo + "             ";	
		this.conteudo = this.conteudo.length() > 15 ? this.conteudo.substring(0, 15) : this.conteudo; 
	
		
		System.out.print(" | " + conteudo);
	}
}
