package treino;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.*;

import treino.singleton.ClassicSingleton;

public class MinhaClasse {

	private static Logger logger = Logger.getLogger("InfoLogging");


	private static Apple app = new Apple();
	private static List <Apple> box = new ArrayList<Apple>();
	
	public static void addFruit(String nome) {
		
		app = new Apple();
		app.setNome(nome);
		box.add(app);
	}
	
	public static void genericsAndLoops () {

		addFruit("Uva");
		addFruit("Maçã");
		addFruit("Pera");
		addFruit("Tomate");

		System.out.println("----------Iterator Generics has.hasNext--------------");

		Iterator <Apple> it = box.iterator();
		while(it.hasNext()) {
			Apple obj = it.next();
			System.out.println(obj.getNome());
		}

		System.out.println("-------for each com generics <Apple>-----------------");

		for(Apple item : box){
			System.out.println(item.getNome());
		}

	}

	public static void hashMap() {

		Map<Integer, String> items = new HashMap<>();
		items.put(1, "oi");
		items.put(4, "voce");
		items.put(3, "vai");
		items.put(2, "como");

		System.out.println("entrySet:"+items.entrySet());
		System.out.println("values..:"+items.values());

		System.out.println("--------------------------");

		for(int x=1; x <= items.size(); x++){
			System.out.print(items.get(x)+"->");
		}

		System.out.println(" ");
		for (Map.Entry<Integer, String> entry : items.entrySet()) {
			System.out.println( entry.getKey() + " " + entry.getValue());
		}

	}

	

	public static void testaTry () {
		String frase = null;
		String novaFrase = null;

		novaFrase = frase.toUpperCase();

	}

	public static void testaExcecaoCustomizada() throws SemLetraBException {

		String frase = "Sou um teste!";
		if(!frase.contains("x"))
			throw new SemLetraBException();
	}

	public static void main(String[] args) throws Exception {

		//testaSingleton();
		//testaNovaSingleton();

		//		//TesteClasseSingleton tc= new TesteClasseSingleton();
		//		
				genericsAndLoops();
				hashMap();

		/*try {
			testaTry();
		}catch(Exception e) 
			{
				System.out.println("O frase inicial está nula! "+ e);
			}
		 */	
		// testaExcecaoCustomizada();
		
		String x = new String ("x");
		String y = "x";
//		if (x == y)
		if (x.equals(y))
			System.out.println("**");
			System.out.println("iguais");
	}

}
/*

Exception: checked and unckecked exception, try / catch / finally
Classes: abstrata, interface, construtores, atributos static
Diferença entre tipos primitivos e objetos. autoboxing e unboxing.
Herança e composição: o uso da palavra 'final'
if / else, for /while.
metodos comuns de String.
diferença entre ArrayList e Vector
qual a diferença entre comparar strings com == e com o metodo Equals.
Como ordenar um array?
no codigo abaixo
public String caixaAlta(String texto) {
   // implementar
}
como vc faria para retornar uma string com tudo em MAIUSCULAS? exemplo
String texto = caixaAlta("ola mundo"); // retorna OLA MUNDO
e como vc faria o mesmo mas para retornar uma string 'ao contrario' ?
eu acho que teria espaço para perguntar sobre Threads, Runnable, java.util.*, trabalhar com Datas e a classe Calendar, Socket e File, acessar banco de dados com JDBC, Anotations, Enumerations, Generics, Serializable, Servlets, Swing, jUnit ... não custa estudar.
Por fim, dado um objeto que tem atributo 'nome' e 'idade', como vc converteria para XML ( ou Json )? Como converteria "de volta"?

 *
 *
 *Convém saber perfeitamente o paradigma OOA, privado/publico heranças etc.
Diferenças entre classes, abstract final etc.
GarbageColector, interfaces, threads, jquerys.
Alguns tipos de dados ArrayLists Hashtables.
 *
 *
 *
 */