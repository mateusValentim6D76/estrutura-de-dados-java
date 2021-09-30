package aula4_ListaEncadeada;

import java.lang.IndexOutOfBoundsException;

public class ListaEncadeada<T> {

	No<T> refEntrada;
	
	public ListaEncadeada(){
		this.refEntrada = null;
	}

	public void add(T conteudo){
		No<T> novoNo = new No<>(conteudo);
		if(this.isEmpty()){
			refEntrada = novoNo;
			return;
		}
		No<T> noAuxiliar = refEntrada;
		for (int i = 0; i < this.size()-1; i++){
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		noAuxiliar.setProximoNo(novoNo);
	}

	public T remove(int index){
		No<T> noPivor = this.getNo(index);
		if(index == 0){
			refEntrada = noPivor.getProximoNo();
			return noPivor.getConteudo();
		}
		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getConteudo();
	}


	public T get(int index){
		return getNo(index).getConteudo();
	}

	private No<T> getNo(int index){
		validaIndice(index);
		No<T> noAuxiliar = refEntrada;
		No<T> noRetorno = null;
		for (int i = 0; i < this.size()-1; i++){
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno;
	}

	private void validaIndice(int index) {
		if (index >= size()) {
			int ultimoIndice = size() -1;
			throw new IndexOutOfBoundsException("Não existe conteúdo no indice"+index+" desta lista. Essa lista só vai até o indice"+ultimoIndice+".");
		}
	}

	public int size() {
		int tamanhoLista = 0;
		No<T> referenciaAux = refEntrada;
		//while infinito :D
		while(true) {
			if(referenciaAux != null) {
				tamanhoLista++;
				//Caso o primeiro No da lista tenha um No afrente dele
				if(referenciaAux.getProximoNo() != null) {
					//Navegar at� o proximo No
					referenciaAux = referenciaAux.getProximoNo();
				}else {
					break;
				}
			}else {
				break;
			}
		} 
		return tamanhoLista;
	}

	public boolean isEmpty() {

		return refEntrada == null ? true : false;
	}
}
