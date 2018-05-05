package treino.heranca.com.poliforfismo;

public class Gerente extends Funcionarios {

	@Override
	public double getBonificacao() {

		return this.salario * 0.20;
		
	}
}