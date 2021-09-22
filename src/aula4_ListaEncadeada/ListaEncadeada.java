package aula4_ListaEncadeada;

public class ListaEncadeada<T> {

	No<T> refEntrada;
	
	public ListaEncadeada(){
		this.refEntrada = null;
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
					//Navegar até o proximo No
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
