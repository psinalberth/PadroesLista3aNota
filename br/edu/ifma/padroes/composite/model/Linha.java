package br.edu.ifma.padroes.composite.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifma.padroes.composite.interfaces.InterfaceCelula;

public class Linha implements InterfaceCelula {
	
	private List<InterfaceCelula> filhos = new ArrayList<InterfaceCelula>();

	@Override
	public void imprimir() {
		System.out.println(" |");
		
		int tamanho = (filhos.size() * 17) + 5;
		char[] linha = new char[tamanho];
		
		for (int i = 0; i < tamanho; i++) 
			linha[i] = '-';
		
		System.out.println(" " + new String(linha));
		
		for (InterfaceCelula filho : filhos) {
			filho.imprimir();
		}
	}
	
	public void adicionar(InterfaceCelula celula) {
		this.filhos.add(celula);
	}
}