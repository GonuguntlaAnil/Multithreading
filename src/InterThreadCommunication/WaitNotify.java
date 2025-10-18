package InterThreadCommunication;

public class WaitNotify extends Thread {
    int sum=0;
    boolean flag=false;
    @Override
    public synchronized void run() {
        for(int i=0;i<10;i++){
            sum=sum+i;
        }
        flag=true;
        notify();
    }

    public static void main(String[] args) throws InterruptedException {
        WaitNotify wn=new WaitNotify();
        wn.start();
        synchronized(wn){
            while(!wn.flag){
                wn.wait();
            }

        }

        System.out.println(wn.sum);
    }
}
