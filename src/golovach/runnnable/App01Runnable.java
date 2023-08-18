package golovach.runnnable;

public class App01Runnable {
//    public static Runnable r = new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("I Do Nothing");
//        }
//    };
    public static Runnable rImpl = new RunnableImpl();
    public static Runnable myFirstRunImpl = new MyFirstRunnableImpl();

    public static void main(String[] args) {
        Thread tr0 = new Thread(rImpl);
        Thread tr1 = new Thread(myFirstRunImpl);
        Thread tr2 = new Thread(myFirstRunImpl);
        Thread trMain = Thread.currentThread();

        tr0.start();

        tr1.start();
        tr2.start();
        System.out.println("trMain is in - " +trMain.getName()+" - thread");
//        System.out.println("rImpl.getClass().getSimpleName() in Thread: "+ Thread.currentThread().getName().toUpperCase());
    }

}
