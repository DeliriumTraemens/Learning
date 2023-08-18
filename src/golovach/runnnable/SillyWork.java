package golovach.runnnable;

public class SillyWork {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
//            sillyWork();
            Thread.sleep(500);
            System.out.println("Hello");
        }
    }

    private static void sillyWork() {
        double d = 2.0;
        for (int i = 0; i < 5_000_000; i++) {
            d=Math.sin(i);
        }
    }

}
