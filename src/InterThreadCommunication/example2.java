package InterThreadCommunication;

public class example2 extends Thread {
    int sum = 0;
    boolean flag=false;
    @Override
    public void run() {
        synchronized (this){
            for(int i=0;i<10;i++){
                sum+=i;
            }
            flag=true;
        notify();}
    }
}class Test4{
    public static void main(String[] args) throws InterruptedException {
        example2 obj = new example2();
        obj.start();
        synchronized (obj){
            while(!obj.flag){
                obj.wait();
            }


        }System.out.println(obj.sum);

    }
}
