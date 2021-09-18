package aula1_No;

public class No <T> {

	private T conteudo;
	private No proximoNo;

	public No(T conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
}
