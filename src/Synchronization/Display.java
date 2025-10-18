package Synchronization;

public class Display {

    public synchronized void wish(String name){
        for(int i=1;i<=15;i++){
            System.out.println(name);
        }
    }
}class MyThread extends Thread{
    Display display;
    String name;
    public MyThread(Display display,String name){
        this.display=display;
        this.name=name;
    }

    @Override
    public synchronized void run() {
        display.wish(name);
    }
}class Main1{
    public static void main(String[] args) {
        Display d1=new Display();

        MyThread a=new MyThread(d1,"anil Kumar");
        MyThread b=new MyThread(d1,"manoj Kumar");
        a.start();
        b.start();
    }
}
