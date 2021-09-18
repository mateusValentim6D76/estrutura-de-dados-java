package aula1_No;

public class Main {

	public static void main(String[] args) {
		
		No no1 = new No("Conteudo no1");
		
		No no2 = new No("Conteudo no1");
		no1.setProximoNo(no2);

		
		No<String> n3 = new No("Conteudo no3");
		No n4 = new No<>("Conteudo no4");
		
		  
	}
}
