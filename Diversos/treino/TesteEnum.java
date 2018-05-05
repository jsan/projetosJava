package treino;

public class TesteEnum {

	enum PLtypes {highlevel, machinelevel, assembly, middlelevel }
	
	public static void main(String[] args) {
		// 
		PLtypes lang;
		lang = PLtypes.highlevel;
		
		// System.out.println(lang);
		
		switch (lang)
		{
		case assembly:
			System.out.println("ass..");

			
		case middlelevel:
			System.out.println("midd..");
			
		case highlevel:
			System.out.println("high..");

		default:
			break;
			
		}
	}

}
