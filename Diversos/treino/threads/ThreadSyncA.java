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
 
        	System.out.println("**************" ); // esse print é para retardar a execução desta classe 
            System.out.println("Total B é igual : " + b.total);
//        }
    }
}