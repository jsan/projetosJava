package treino.singleton;

public class TesteClasseSingleton {
	
	public static void main (String [] args) {
		
		ClassicSingleton.getInstance();
		
		TestaInstancia i = new TestaInstancia();
		ClassicSingleton.getNewInstance();
		
		if (ClassicSingleton.getInstance() == i.testaInstancia())
			System.out.println("ok");		
//		ClassicSingleton i = new ClassicSingleton(); // a classe ClassicSingleton est� protegida cronta instancias novas!!!
	}

}
 