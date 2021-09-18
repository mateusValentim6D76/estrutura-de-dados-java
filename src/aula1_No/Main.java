package aula1_No;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Declarar o tipo do Objeto a ser recebido 
		 * dentro da instanciação do objeto é inferente
		 */
		
		No<String> no1 = new No<>("Conteudo no1");		
		No<String> no2 = new No<String>("Conteudo no2");
		no1.setProximoNo(no2);

		No<String> no3 = new No<>("Conteudo no3");
		no2.setProximoNo(no3);		
		No<String> no4 = new No<>("Conteudo no4");
		no3.setProximoNo(no4);
		  
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
	}
}
