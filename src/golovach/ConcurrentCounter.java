package golovach;

public class ConcurrentCounter {
    public static final int N = 100_000_000;
    public static  volatile int counter = 0;
    public static void inc(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++) counter++;
            }
        });
        t0.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++) counter++;
            }
        });
        t1.start();

        t0.join();
        t1.join();

        System.out.println("Counter is " + counter);
    }
}