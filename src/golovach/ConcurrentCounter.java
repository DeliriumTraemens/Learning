package golovach;

public class ConcurrentCounter {
    public static final int N = 10_000_000;
    public static  int counter = 0;
    public static synchronized void inc(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++) inc();
            }
        });
        t0.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++) inc();
            }
        });
        t1.start();

        t0.join();
        t1.join();

        System.out.println("Counter is " + counter);
    }
}
