package treino.threads;

public class ThreadSyncA {


	public static void main(String[] args) {
		ThreadSyncB b = new ThreadSyncB();
        b.start();
//        synchronized(b){ 						// comentar 
//            try{ 								// comentar 
                System.out.println("Aguardando o b completar, e trabalhando enquanto isso em outra coisa...");//  nao comentar 
//                b.wait();						// comentar 
//            }catch(InterruptedException e){		// comentar 
//                e.printStackTrace();			// comentar 
//            }									// comentar 
 
        	System.out.println("**************" ); // esse print � para retardar a execu��o desta classe 
            System.out.println("Total B � igual : " + b.total);
//        }
    }
}