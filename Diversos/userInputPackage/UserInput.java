package userInputPackage;

public class UserInput {
	
	
	static int currentValue;
	static int valorI = 0;
	
	public static class TextData {

		public void add(char c) {
			System.out.println("metodo sobreposto pelo add do NumericData(overrided)");
			currentValue = currentValue + c;
		}
		
		
		public int getValue() {
			System.out.println("retornando soma from class TextData...");
			return currentValue;
		}

	}

	public static class NumericData extends TextData {
		
		// overriding method add from class TextData
		@Override
		public void add(char param) {
			valorI = param - '0';
			if (valorI  < 10)
				currentValue += valorI;
		}
		
	}

	public static void main(String args[]) {
		TextData input = new NumericData();
		input.add('1');
		input.add('1');
		input.add('1');
		input.add('1');
		input.add('a');
		input.add('s');
		input.add('x');
		input.add('3');   
		input.add('3');   
		System.out.println("Total dos valores numericos Char.....: "+input.getValue());
	}
}
