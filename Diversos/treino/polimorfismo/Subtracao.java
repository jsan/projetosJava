package treino.polimorfismo;

public class Subtracao extends Operacao {

	public double calcular(double x) {
		return x - x;
	}

	public double calcular(double x, double y) {
		return x - y;
	}

}
