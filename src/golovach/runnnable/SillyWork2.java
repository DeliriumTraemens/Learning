package golovach.runnnable;

public class SillyWork2 {
    public static void main(String[] args) {
        new Thread(new Runnable(){
           public void run(){
               sillyWork();
               System.out.println("Hello!");
               System.out.println("Hello-hello!");
               System.out.println("Hello there!");
               System.out.println("Hello there and there!");
           }
        }).start();

        for (int i = 0; i < 5 ; i++) {
            sillyWork();
            System.out.println("Bye-bye! " + i);
        }
    }

    private static void sillyWork(){
        double d = 2.0;
        for (int i = 0; i < 10000000 ; i++) {
            d=Math.sin(d);
        }
    }
}
