package treino;

class Animal {
	public void emitir_Som() {
		System.out.println("Animals emitem som");
	}
}

class Dog extends Animal {
	public void emitir_Som() {
		System.out.println("Dog AuAu");
	}
}

class Cat extends Animal {
	public void emitir_Som() {
		System.out.println("Cat MiauMiau");
	}
}

public class TestDog {

	public static void main(String args[]) {
		Animal a = new Animal();   // Animal reference and object
		Animal b = new Dog();   // Animal reference but Dog object
		Animal c = new Cat();   // Animal reference but Dog object

		a.emitir_Som();   // runs the method emitir_Som() in Animal class
		b.emitir_Som();   // runs the method emitir_Som() in Dog class
		c.emitir_Som();   // runs the method emitir_Som() in Dog class
	}
}