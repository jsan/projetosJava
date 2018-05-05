package treino.singleton;

public class TestaInstancia {
	
	public ClassicSingleton testaInstancia() {
		
		ClassicSingleton.getInstance();
		return ClassicSingleton.getInstance();
	}

}
