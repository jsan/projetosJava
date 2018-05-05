package treino.threads;

public class MultiThreadA {

	public static void main(String[] args) {

		MultiThreadB t1=new MultiThreadB();  
		MultiThreadB t2=new MultiThreadB();  

		t1.run();  
		t2.start();  
	}  

}
