package Q2;
public class Main {
    
    public static void main(String[] args) throws InterruptedException{        
        Thread t1 = new Thread(new MyRunnable(1));
        t1.start();
        t1.join();
        Thread t2 = new Thread(new MyRunnable(2));
        t2.start();
        
    }
}