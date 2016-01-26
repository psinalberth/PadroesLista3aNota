package br.edu.ifma.padroes.composite.model;

import br.edu.ifma.padroes.composite.interfaces.InterfaceArquivo;

public abstract class ArquivoAbstrato implements InterfaceArquivo {
	
	private String nome;
	
	public ArquivoAbstrato() {
	
	}
	
	public ArquivoAbstrato(String nome) {
		this.nome = nome;
	}
	
	@Override
	public abstract void listar();


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	} 
}