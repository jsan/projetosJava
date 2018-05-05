package treino.polimorfismo;

/*
 * Cria-se uma classe abstrata com um ou mais métodos sem corpo (classes filhas são obrigadas a implementá-los)
 * criam-se classes filhas(extends) que fazem override sobre esses métodos (soma e subtracao)
 * 
 * Para acessar o metodo calcular especificar qual objeto se quer (Somar ou subtrair)
 * 
 * Através do metodo mostraResultado (objeto, valor, valor)
 * (mais modular, melhor para projetos mais complexos)
 * 
 * ou diretamente (menos modular) 
 * 
 *			 		  ___ Soma()
 *					 /	
 * 	       			/
 * 			Operação 
 *  				\
 *  		 		 \___ Subtracao()
 * 
*/
public class Conta {

	public static void mostraResultado(Operacao om, double x, double y) {

		System.out.println("Resultado A.......:" + om.calcular(x));
		System.out.println("Resultado B.......:" + om.calcular(x, y));
		
	}

	public static void main(String[] args) {
		
//		Acesso atraves do metodo (objeto, valor, valor)
		mostraResultado(new Soma(), 6, 1);
		System.out.println("------------------------------------------");
		mostraResultado(new Subtracao(), 6, 1);

//		Acesso direto, menos modular 
//		System.out.println(new Soma().calcular(5,4));
//		System.out.println(new Subtracao().calcular(5,4));
	
	}

}
