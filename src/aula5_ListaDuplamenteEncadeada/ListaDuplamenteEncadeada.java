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
		return tamanhoLista;
	}
	
	private NoDuplo<T> getNo() {
		
	}
}
