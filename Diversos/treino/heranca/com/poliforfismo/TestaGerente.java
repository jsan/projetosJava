package treino.heranca.com.poliforfismo;
/*
 * A classe Gerente (classe filha da super classe Funcionario)
 *  overrides o metodo get bonificacao do da super Classe
*/

public class TestaGerente {

	public static void main (String [] args) {
		
		Funcionarios funcionario = new Funcionarios();
		Gerente 	 gerente	  = new Gerente(); // extends class Funcionario
		
		funcionario.setNome("Gerente");
		funcionario.setSalario(5000.0);

		gerente.setNome("Comum  ");
		gerente.setSalario	 (5000.0);
		
		System.out.println("Bonificação Gerente '"+gerente.getNome()+"'....: "+ gerente.getBonificacao()); // method overriding
	    System.out.println("Bonificação Funcion:'"+funcionario.getNome()+"'....:  "+funcionario.getBonificacao());
		
	}
	
}
