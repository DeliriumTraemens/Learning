package golovach.runnnable;

public class JoinSample {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread= new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    sillyWork();
                    System.out.println("Thread named "+Thread.currentThread().getName()+ " goes "+i+" iteration");
                    System.out.println("Hello!");
                    System.out.println("Hello-hello!");
//                    System.out.println("Hello there!");
//                    System.out.println("Hello there and there!");
                }
            }
        });
        myThread.start();

        for (int i = 0; i <3 ; i++) {
            sillyWork();
            System.out.println("Bye! #"+i);
        }

//        myThread.wait();
        myThread.join();
        System.out.println("\n===========\nThat's All");


    }

    private static void sillyWork() {
        double d = 2.0;
        for (int i = 0; i < 10000000; i++) {
            d = Math.sin(d);
        }
    }

}
