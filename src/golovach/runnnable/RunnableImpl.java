package golovach.runnnable;

public class RunnableImpl implements Runnable{

    @Override
    public synchronized void run() {
        System.out.println("1 It's run() method in Thread "+Thread.currentThread().getName());
        System.out.println("2 It's run() method in Thread "+Thread.currentThread().getName());
        System.out.println("3 It's run() method in Thread "+Thread.currentThread().getName());
        System.out.println("4 It's run() method in Thread "+Thread.currentThread().getName());
    }
}
