package treino.construtores;

public class Aplic {

	public static void main (String [] args) {
		
		Carro fiat = new Carro("Fiat", 6000050, "Uno", "Vermelho"); 
		Carro honda = new Carro("Honda", 7000000, "Civic"); // default cor PRETO

		System.out.println(fiat.xxx());
		System.out.println(honda.xxx());
		honda = new Carro("Honda", 7500000, "Civic","Pérola"); // default cor PRETO
		System.out.println(honda.xxx());
		
	}


}
