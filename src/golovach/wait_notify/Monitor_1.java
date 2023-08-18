package golovach.wait_notify;

public class Monitor_1 {
        private static Object monitorr = new Object();
    private static void sample() throws InterruptedException{

        synchronized (monitorr) {
            Object ref = new Object();
            monitorr.wait(100);
        }
    }

    private static void sample2() throws InterruptedException {
        Monitor_1.class.wait(2000);
        System.out.println("sample2 is awakened");
    }
    public static void main(String[] args) throws InterruptedException {
        sample();
        Object ref2=new Object();
        synchronized(ref2){
            System.out.println("Going to wait");
            ref2.wait(3000);
            System.out.println("Awakened");
        }
        synchronized(Monitor_1.class){
            System.out.println("Just synchroblock");
            Monitor_1.class.wait(2000);
            System.out.println("Synchroblock awakened");
        }

        Class<?> monitorRefl = Monitor_1.class;
        synchronized (monitorRefl){
            monitorRefl.wait(2000);
            System.out.println("Just awakened with reflection object");
            System.out.println(Thread.currentThread().isAlive());
        }
//        sample2();
    }
}
