package aula7_Arvores;

public class ArvoreBinaria<T extends Comparable<T>> {

	private BinNo<T> raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
		if(atual == null) {
			return novoNo;
		} else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
			atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
		} else {
			atual.setNoDir(inserir(atual.getNoDir(), novoNo));
		}
		return atual;
		
	}
}
