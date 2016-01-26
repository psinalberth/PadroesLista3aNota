package br.edu.ifma.padroes.composite.model;

import br.edu.ifma.padroes.composite.interfaces.InterfaceArquivo;

public class Arquivo extends ArquivoAbstrato implements InterfaceArquivo {
	
	private int tamanho;
	
	public Arquivo() {
		
	}
	
	public Arquivo(String nome, int tamanho) {
		super(nome);
		this.tamanho = tamanho;
	}

	public void listar() {
		System.out.println(this.getNome() + " [" + this.getTamanho() + " KB]");
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}	
}