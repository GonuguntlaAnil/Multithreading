package PreventExecution;


/* pause current Thread Execution and give chance to waiting Threads which have
  same Priority*/
public class Yield1 extends Thread {
    public void run(){
        for(int j=0;j<10;j++){
            System.out.println("child Thread "+j);

        }
    }
}class Test2{
    public static void main(String[] args) {
        Yield1 y=new Yield1();
        y.start();

        for(int i=0;i<10;i++)
        {
            Thread.yield();
            System.out.println("Main Thread "+i);
        }
    }
}
