package aula5_ListaDuplamenteEncadeada;

public class Main {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> listaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();
		
		
		listaDuplamenteEncadeada.add("c1");
		listaDuplamenteEncadeada.add("c2");
		listaDuplamenteEncadeada.add("c3");
		listaDuplamenteEncadeada.add("c4");
		listaDuplamenteEncadeada.add("c5");
		listaDuplamenteEncadeada.add("c6");
		listaDuplamenteEncadeada.add("c7");
		
		System.out.println(listaDuplamenteEncadeada+"\n");
		
		listaDuplamenteEncadeada.remove(3);
		
		System.out.println("Após a remoção de um nó: "+listaDuplamenteEncadeada +"\n");
		
		listaDuplamenteEncadeada.add(3, "77");
		
		System.out.println("Após a inserção de um nó, no mesmo indice que foi removido anteriormente: "+listaDuplamenteEncadeada);
	}
}
