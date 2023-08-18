package arkhipov.multithread.chat_gpt_sample;

import java.util.Map;

public class WaitAndNotifyChanGptSample {

    public static void main(String[] args) throws InterruptedException {
        Object monitor = new Object();


        Thread t1 = new Thread(new Waiter(monitor));
        Thread t2 = new Thread(new Notifier(monitor));
        t1.start();
        Thread.sleep(1000);
        t2.start();
    }

    static class Waiter implements Runnable {

        private final Object waiterMonitor;

        public Waiter(Object monitor) {
            this.waiterMonitor = monitor;
        }

        @Override
        public void run() {
            checkMonitorHold(waiterMonitor);
            synchronized (waiterMonitor) {
                System.out.println(this.getClass().getSimpleName()+" is Waiting...");
                checkMonitorHold(waiterMonitor);
                try {
                    System.out.println(this.getClass().getSimpleName()+" gonna do WAIT");
                    Thread.sleep(1000);
                    waiterMonitor.wait();
                    System.out.println(this.getClass().getSimpleName()+" JUST performed WAIT");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getClass().getSimpleName()+" is Notified!");
                checkMonitorHold(waiterMonitor);

            }
        }

        public void checkMonitorHold(Object waiterMonitor) {

            if(Thread.holdsLock(this.waiterMonitor)) {
                System.out.println(this.getClass().getSimpleName()+" This thread holds the lock on monitor "+waiterMonitor.hashCode());
            } else {
                System.out.println("This thread does not hold the lock on obj "+waiterMonitor.hashCode());
            }
        }
    }

    static class Notifier implements Runnable {

        private final Object monitor;

        public Notifier(Object monitor) {
            this.monitor = monitor;
        }

        @Override
        public void run() {
            synchronized (monitor) {
                checkMonitorHold();
                System.out.println(this.getClass().getSimpleName()+" Notifying...");
                monitor.notify();



//                printStackTrace();

            }
        }

        private void checkMonitorHold() {
            if(Thread.holdsLock(monitor)) {
                System.out.println(this.getClass().getSimpleName()+" This thread holds the lock on monitor "+monitor.hashCode());
            } else {
                System.out.println("This thread does not hold the lock on obj");
            }
        }


        private void printStackTrace() {
            Map<Thread, StackTraceElement[]> stackTraceMap = Thread.getAllStackTraces();

            for(Map.Entry<Thread, StackTraceElement[]> entry : stackTraceMap.entrySet()) {
                Thread thread = entry.getKey();
                StackTraceElement[] stackTrace = entry.getValue();
                System.out.println("Thread " + thread.getName() + " has stack trace:");
                for(StackTraceElement element : stackTrace) {
                    System.out.println("\t" + element.toString());
                }
            }
        }
    }

}
