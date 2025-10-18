package PreventExecution;

/*If one Thread wants to wait until another Thread execution
 completes then we go for join method it throws Exception*/
public class Join1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("child Thread"+i);
        }
    }
}class Test3{
    public static void main(String[] args)  {
        Join1 j=new Join1();
        j.start();

        for (int i=0;i<10;i++){
            System.out.println("Main Thread"+i);
        }
    }
}
