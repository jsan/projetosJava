package treino.singleton;

public final class ClassicSingleton {

	private static ClassicSingleton instance = null;

	private ClassicSingleton () {
	}

	public static ClassicSingleton getInstance() {
		if(instance == null) {
			instance = new ClassicSingleton();
			System.out.println(" ");
			System.out.println("instanciou a classe ClassicSingleton:"+instance);
		}else {
			System.out.println("....................................:"+instance);
		}
		return instance;
	}
	
	public static ClassicSingleton getNewInstance() {
		instance = null;
		return instance;
	}
}