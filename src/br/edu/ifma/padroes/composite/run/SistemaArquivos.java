package br.edu.ifma.padroes.composite.run;

import br.edu.ifma.padroes.composite.model.Arquivo;
import br.edu.ifma.padroes.composite.model.Diretorio;

public class SistemaArquivos {
	
	public static StringBuffer sb = new StringBuffer("|");
	
	public static void main(String[] args) {
		
		Diretorio d1 = new Diretorio("Pasta Pessoal");
		
		Diretorio d2 = new Diretorio("Meus Documentos");
		d2.adicionar(new Arquivo("Lista de Exercícios 1.pdf", 101));
		d2.adicionar(new Arquivo("Curriculum.odt", 125));
		Diretorio d3 = new Diretorio("Minhas Músicas");
		
		Diretorio d4 = new Diretorio("Scorpions - Acoustica (2001)");
		d4.adicionar(new Arquivo("01 The Zoo.mp3", 4684));
		d4.adicionar(new Arquivo("02 Always Somewhere.mp3", 5074));
		d4.adicionar(new Arquivo("03 Life Is Too Short.mp3", 4344));
		d4.adicionar(new Arquivo("07 Dust In The Wind", 5971));
		d4.adicionar(new Arquivo("08 Send Me An Angel.mp3", 4974));
		
		d1.adicionar(d2);
		d2.adicionar(d3);
		d3.adicionar(d4);
		
		
		
		d1.listar();
	}
}
