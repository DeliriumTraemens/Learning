package golovach.runnnable;

public class App01Runnable {
    public static Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("I Do Nothing");
        }
    };
    public static Runnable rImpl = new RunnableImpl();

    public static void main(String[] args) {
        Thread tr0 = new Thread(rImpl);
        tr0.start();
        System.out.println(rImpl.getClass().getSimpleName());
    }

}
