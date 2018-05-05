package treino.threads;

public class ThreadSyncB extends Thread{
	
    int total;
    public void run(){
//        synchronized(this){  //comentar para testar sem o sync
            for(int i=0; i<50000 ; i++){
                total += i;
//                try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
                //System.out.println(i);
            }
//            notify();		// comentar
//        }
    }

}
