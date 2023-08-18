package arkhipov.multithread;

public class SynchronizeSample {
    private static int counter;

     public static void test1(Object locker) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized(locker){
                    counter = 0;
                    for (int i = 0; i < 25; i++) {
                        counter++;
                        System.out.println(Thread.currentThread().getName() + ": ==========>" + counter);
                        System.out.println(Thread.currentThread().getName()+"--one");
                        System.out.println(Thread.currentThread().getName()+"--two");
                        System.out.println(Thread.currentThread().getName()+"--three");
                        System.out.println(Thread.currentThread().getName()+"--four");
                        System.out.println(Thread.currentThread().getName()+"--five");
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

         try {
             thread1.join();
             thread2.join();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
    }

    private static synchronized void synchroBlock(){
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
    }

    
    public static void main(String[] args) {

        synchroBlock();

        Object lockerObj = new Object();
        test1(lockerObj);
    }

}
