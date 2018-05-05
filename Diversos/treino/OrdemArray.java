package treino;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrdemArray {

	public OrdemArray() {

	}

	public static void main(String[] args) {
		
		List <String> as = new ArrayList<>();
		
		as.add(0, "1");
		as.add(1, "2");
		as.add(2, "3");
		
		for (Iterator<String> iter = as.iterator(); iter.hasNext(); ) {
		    System.out.println("---------->"+iter.next());
		}
		
		String[] array = new String[10];
		
		array[0] = "1";
		array[1] = "2";
		array[2] = "3";
		int cont=0;
		for (Object al : array) {
			++cont;
			System.out.println(cont+">"+al);
			
		}

		/*
		 * int[] array = new int[10]; Random gerador = new Random();
		 * 
		 * for(int i=0;i<10;i++){ array[i]=gerador.nextInt(250); }
		 * 
		 * System.out.println("Antes"); for(int i: array){ System.out.println(i); }
		 * 
		 * Arrays.sort(array); System.out.println("Depois"); for(int i: array)
		 * System.out.println(i);
		 */

		int a = Integer.parseInt("9");
		double c = Double.parseDouble("5.1");
		int b = Integer.parseInt("444", 16);

		System.out.println(a);
		System.out.println(c);
		System.out.println(b);

		System.out.println(Math.min(12.123, 12.456));
		System.out.println(Math.min(23.12, 23.0));

		
		System.out.println("------");
		
	      System.out.println(Character.isDigit('c'));
	      System.out.println(Character.isDigit('5'));
	      
	      System.out.println(Character.isLetter('3'));
		Integer x = 515;

		// Returns byte primitive data type
		System.out.println(x.intValue());

		// Returns double primitive data type
		System.out.println(x.shortValue());

		// Returns long primitive data type
		System.out.println(x.floatValue());
		
		double f = ((0.3 * 10) - (0.2 * 10)) / 10;
		System.out.println(">"+f);
		
		char s = 'd';	
		System.out.println(s);

	}
}
