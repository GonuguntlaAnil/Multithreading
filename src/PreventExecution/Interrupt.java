package PreventExecution;

public class Interrupt extends Thread{
    //interupt used to interupt sleeping/waiting thread

    @Override
    public void run() {
        try {
            for(int j=0;j<5;j++){
                System.out.println("i am sleeping thread"+j);
                Thread.sleep(1000);

            }
        }
       catch (InterruptedException e) {
           System.out.println("interrupted ");
       }
    }

    public static void main(String[] args) {
        Interrupt obj=new Interrupt();
        obj.start();
        obj.interrupt();
        System.out.println("end of main thread");
    }
}
