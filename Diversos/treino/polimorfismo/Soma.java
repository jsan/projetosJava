package treino.polimorfismo;

public class Soma extends Operacao {

	public double calcular(double x) {
		return x +x;
	}

	public double calcular(double x, double y) {
		return x + y;
	}

}
