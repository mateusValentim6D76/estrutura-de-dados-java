package aula2_Pilhas;

public class Pilha {

	private No refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public void push(No novoNo) {
		No refAuxiliar =  refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}
	public boolean isEmpty() {
//		if(refNoEntradaPilha == null) {
//			return true;
//		} return false;
		return refNoEntradaPilha == null ? true : false;
	} 
	
	public No pop() {
	 if(!this.isEmpty()) {
		 No noPoped = refNoEntradaPilha;
		 refNoEntradaPilha.getRefNo();
	 }
	 return null;
	}
	
	public No top() {
		return refNoEntradaPilha;
	}
	
	@Override
	public String toString() {
		String stringRetorno = "==============\n";
		stringRetorno = "Pilha\n";
		stringRetorno = "==============\n";
		
		No noAuxiliar = refNoEntradaPilha;
		
		while(true) {
			if(noAuxiliar != null) {
				stringRetorno += "No{Dado: "+noAuxiliar.getDado()+"}]\n";
			} else {
				break;
		}
	}
	stringRetorno += "==============";
	return stringRetorno;
	
	}
}
