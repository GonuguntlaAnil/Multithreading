package InterThreadCommunication;

public class WaitNotify extends Thread {
    int sum=0;
    @Override
    public synchronized void run() {
        for(int i=0;i<10;i++){
            sum=sum+i;
        }
        notify();
    }

    public static void main(String[] args) throws InterruptedException {
        WaitNotify wn=new WaitNotify();
        wn.start();
        synchronized(wn){
            wn.wait();
        }

        System.out.println(wn.sum);
    }
}
