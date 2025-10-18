package PreventExecution;

public class Join2 extends Thread  {
    static Thread mt;
    public void run(){
        try{
        mt.join();}
        catch(InterruptedException e){
            for(int k=0;k<10;k++){
                System.out.println("child Thread"+k);
            }
        }

    }

    public static void main(String[] args)  {
        mt=Thread.currentThread();
        Join2 obj=new Join2();
        obj.start();

        for(int j=0;j<10;j++){
            System.out.println("main Thread"+j);

        }
    }
}
