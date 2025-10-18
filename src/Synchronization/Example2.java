package Synchronization;

public class Example2 extends Thread {
    String name;

  public Example2(String name){
        this.name=name;
    }
    public void run() {
       display(name);
    }public void display(String name){
        for(int i=0;i<10;i++){
            System.out.println(name);
        }
    }
}class Test3{
    public static void main(String[] args) {
        Example2 obj=new Example2("anil");
        Example2 obj1=new Example2("manoj");
        obj.start();
        obj1.start();
    }
}
