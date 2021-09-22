package aula3_Fila;

public class Fila<T> {

	private No<T> refNoEntradaFila;

	public Fila() {
		this.refNoEntradaFila = null;
	}

	// Enfileira atrás do ultimo nó
	public void enqueue(T obj) {
		No<T> novoNo = new No(obj);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}

	public T first() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while (true) {
				if (primeiroNo.getRefProximoNo() != null) {
					primeiroNo = primeiroNo.getRefProximoNo();
				} else {
					break;
				}
			}
			return (T) primeiroNo.getObject();

		}
		return null;
	}

	// Retira o primeiro No da fila e me retorna ele
	public T dequeue() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			while (true) {
				if (primeiroNo.getRefProximoNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo.getRefProximoNo();
				} else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return (T) primeiroNo.getObject();
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

		if (refNoEntradaFila != null) {
			while (true) {
				stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]---->";
				if (noAuxiliar.getRefProximoNo() != null) {
					noAuxiliar = noAuxiliar.getRefProximoNo();
				} else {
					stringRetorno += "null";
					break;
				}
			}
		} else {
			stringRetorno = "null";
		}
		return stringRetorno;
	}
}
