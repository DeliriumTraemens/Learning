package golovach.runnnable;

public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("It's run() method"+this.getClass().getName());
    }
}
