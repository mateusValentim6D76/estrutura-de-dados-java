package aula5_ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada <T> {

	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	
	private int tamanhoLista;
	
	public ListaDuplamenteEncadeada() {
		this.tamanhoLista = 0;
		this.primeiroNo = null;
		this.ultimoNo = null;
	}
	
	public int size() {
		return this.tamanhoLista;
	}
	
	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoProximo(null);
		novoNo.setNoPrevio(ultimoNo);
		if(primeiroNo == null) {
			this.primeiroNo = novoNo;
		}
		if(ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}
		
		ultimoNo = novoNo;
		tamanhoLista++;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	private NoDuplo<T> getNo(int index) {
		NoDuplo<T> noAuxiliar = primeiroNo;
			for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
		return noAuxiliar;
	}
}
