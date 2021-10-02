package aula6_ListaCirculares;

public class ListaCircular<T> {

	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;

	public boolean isEmpty() {
		return tamanhoLista == 0 ? true : false;
	}

	public int size() {
		return this.tamanhoLista;
	}
}
