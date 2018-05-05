package treino.construtores;

import java.text.DecimalFormat;

public class Carro {


	private String marca;
	private double preco;
	private String modelo;
	private String cor;

	public Carro (String marca, double preco, String modelo) {
		this.marca = marca;
		this.preco = preco /100;
		this.modelo = modelo;
		this.cor = "PRETO";
	}

	public Carro (String marca, double preco, String modelo, String cor) {
		this.marca = marca;
		this.preco = preco /100;
		this.modelo = modelo;
		this.cor = cor;
	}

	public String xxx() {

		DecimalFormat DINHEIRO_REAL = new DecimalFormat("¤ ###,###,##0.00");
		return marca+" / "+modelo+" / "+cor+" / "+DINHEIRO_REAL.format(preco);
	}

}
