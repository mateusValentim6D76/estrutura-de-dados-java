package aula3_Fila;

public class Fila {

	private No refNoEntradaFila;

	public Fila() {
		this.refNoEntradaFila = null;
	}

	// Enfileira atrás do ultimo nó
	public void enqueue(No novoNo) {
		novoNo.setRefNo(refNoEntradaFila);
	}

	public No first() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while (true) {
				if (primeiroNo.getRefNo() != null) {
					primeiroNo.getRefNo();
				} else {
					break;
				}
			}
		}
		return null;
	}
	
	//Retira o primeiro No da fila
	public No dequeue() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			while (true) {
				if (primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo.getRefNo();
				} else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return primeiroNo;
		}
		return null;
	}

	public boolean isEmpty() {
		return refNoEntradaFila == null ? true : false;
	}
	
	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = refNoEntradaFila;
		if(refNoEntradaFila != null) {
			while(true) {
				stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]---->";
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				}else {
					stringRetorno += "null";
					break;
				}
			}
		}else {
			stringRetorno = "null";
		}
		return stringRetorno;
	}
}
