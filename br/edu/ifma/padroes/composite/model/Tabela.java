package br.edu.ifma.padroes.composite.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifma.padroes.composite.interfaces.InterfaceCelula;

public class Tabela implements InterfaceCelula {
	
	private List<InterfaceCelula> linhas = new ArrayList<InterfaceCelula>();

	@Override
	public void imprimir() {
		
		for (InterfaceCelula linha : linhas) {	
			linha.imprimir();
		}
	}

	
	public void adicionar(InterfaceCelula linha) {
		this.linhas.add(linha);
	}
}