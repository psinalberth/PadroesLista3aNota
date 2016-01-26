package br.edu.ifma.padroes.composite.run;

import br.edu.ifma.padroes.composite.model.Celula;
import br.edu.ifma.padroes.composite.model.Linha;
import br.edu.ifma.padroes.composite.model.Tabela;

public class TesteTabela {

	public static void main(String[] args) {
		
		Tabela tabela = new Tabela();
		
		Linha l1 = new Linha();
		Linha l2 = new Linha();
		Linha l3 = new Linha();
		
		Celula c1 = new Celula("Lorem Ipsum Dolor");
		Celula c2 = new Celula("Nome");
		Celula c3 = new Celula("Dummy Text");
		Celula c4 = new Celula("Nome");
		
		l1.adicionar(c1);
		l1.adicionar(c2);
		l1.adicionar(c3);
		
		l2.adicionar(c3);
		l2.adicionar(c4);
		l2.adicionar(c1);
		
		l3.adicionar(c3);
		l3.adicionar(c4);
		l3.adicionar(c1);
		
		tabela.adicionar(l1);
		tabela.adicionar(l2);
		tabela.adicionar(l3);
		
		tabela.imprimir();
	}

}
