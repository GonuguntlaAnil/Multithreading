package DefiningThread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("child Thread"+Thread.currentThread().getName());
        }
    }
}class Test{
    public static void main(String[] args)  {
        MyThread thread = new MyThread();
        thread.start();


        for(int i=0;i<10;i++){
            System.out.println("Main Thread"+Thread.currentThread().getName());
        }
    }
}


