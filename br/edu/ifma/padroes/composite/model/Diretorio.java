package br.edu.ifma.padroes.composite.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.edu.ifma.padroes.composite.run.SistemaArquivos;

public class Diretorio extends ArquivoAbstrato {
	
	private List<ArquivoAbstrato> filhos = new ArrayList<ArquivoAbstrato>();
	
	public Diretorio() {
		super();
	}
	
	public Diretorio(String nome) {
		super(nome);
	}
	
	public Diretorio(String nome, List<ArquivoAbstrato> filhos) {
		super(nome);
		this.filhos = filhos;
	}

	@Override
	public void listar() {
		
		System.out.println(SistemaArquivos.sb + this.getNome());
		SistemaArquivos.sb.append("_");
		Collections.sort(this.getFilhos(), Diretorio.diretorioComparator);
		
		for (ArquivoAbstrato arquivo : filhos) {	
			arquivo.listar();
		}
	}
	
	public void adicionar(ArquivoAbstrato arquivo) {
		this.filhos.add(arquivo);
	}

	public List<ArquivoAbstrato> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<ArquivoAbstrato> filhos) {
		this.filhos = filhos;
	}
	
	public static Comparator<ArquivoAbstrato> diretorioComparator = new Comparator<ArquivoAbstrato>() {

		@Override
		public int compare(ArquivoAbstrato o1, ArquivoAbstrato o2) {
			
			if (o1 instanceof Diretorio && o2 instanceof Arquivo) {
				
				return o1.hashCode() - o2.hashCode();
				
			} else if (o1 instanceof Arquivo && o2 instanceof Diretorio) {
				
				return o2.hashCode();
			}
			
			return 0;
		}
	};
}