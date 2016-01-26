package br.edu.ifma.padroes.composite.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifma.padroes.composite.interfaces.InterfaceCelula;

public class Linha extends CelulaAbstrata implements InterfaceCelula {
	
	private List<Celula> celulas = new ArrayList<Celula>();

	@Override
	public void imprimir() {
		System.out.println(" |");
		
		int tamanho = (celulas.size() * 17) + 5;
		char[] linha = new char[tamanho];
		
		for (int i = 0; i < tamanho; i++) linha[i] = '-';
		System.out.println(" " + new String(linha));
		for (int i = 0; i < celulas.size(); i++)
		System.out.print(" " + celulas.get(i).getConteudo());
	}
	
	public List<Celula> getCelulas() {
		return celulas;
	}
	
	public void adicionar(Celula celula) {
		this.celulas.add(celula);
	}
}