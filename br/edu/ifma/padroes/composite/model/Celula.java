package br.edu.ifma.padroes.composite.model;

import br.edu.ifma.padroes.composite.interfaces.InterfaceCelula;

public class Celula implements InterfaceCelula {
	
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
		
		this.conteudo = this.conteudo + "            ";
		//this.conteudo = this.conteudo;
		
		System.out.print(" | " + conteudo);
	}
}
