package br.edu.ifma.padroes.composite.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifma.padroes.composite.interfaces.Componente;

public class Tabela implements Componente {
	
	private List<Componente> linhas = new ArrayList<Componente>();

	@Override
	public void imprimir() {
		
		for (Componente linha : linhas) {
			
			linha.imprimir();
		}
	}
	
	public void adicionar(Componente linha) {
		this.linhas.add(linha);
	}
}