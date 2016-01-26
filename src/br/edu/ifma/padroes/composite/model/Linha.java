package br.edu.ifma.padroes.composite.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifma.padroes.composite.interfaces.Componente;

public class Linha implements Componente {
	
	private List<Componente> filhos = new ArrayList<Componente>();

	@Override
	public void imprimir() {
		
		int tamanho = (filhos.size() * 17) + 4;
		char[] linha = new char[tamanho];
		
		for (int i = 0; i < tamanho; i++) 
			linha[i] = '-';
		
		System.out.println(" " + new String(linha));
		
		for (Componente filho : filhos) {
			
			filho.imprimir();
		}
		
		System.out.print(" |");
		System.out.println("\n " + new String(linha));
	}
	
	public void adicionar(Componente celula) {
		this.filhos.add(celula);
	}
}