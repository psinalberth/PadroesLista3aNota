package br.edu.ifma.padroes.composite.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifma.padroes.composite.interfaces.InterfaceCelula;

public class Tabela implements InterfaceCelula {
	
	private List<Linha> linhas = new ArrayList<Linha>();

	@Override
	public void imprimir() {
		
		for (Linha linha : linhas) {	
			linha.imprimir();
		}
	}
	
	public List<Linha> getLinhas() {
		return linhas;
	}
	
	public void adicionar(Linha linha) {
		this.linhas.add(linha);
	}
}