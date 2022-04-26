package Q1;

public class MyThread implements Runnable {
    private Thread t;
    private String threadName;


    public void run(){
        Thread t = Thread.currentThread();
        System.out.println("started: "+t.getName());
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("ended: "+t.getName());
    }

    public static void main(String[] args) {
        MyThread t3 = new MyThread();

        t3.run();

    }
}
