package golovach.accordion;

import golovach.rabbitattack.PrintRunnable;

public class Accordion {
    public static void main(String[] args) throws InterruptedException{
        for (int i=0;i<5;i++) {
            Runnable printerA = new PrintRunnable("A      .", 100);
            Thread threadA = new Thread(printerA);
            threadA.start();

            Runnable printerB = new PrintRunnable(".      B", 99);
            Thread threadB = new Thread(printerB);
            threadB.start();

            threadB.join();
            threadA.join();

//C
            System.out.println("==============");

            Runnable printerC = new PrintRunnable("    C", 100);
            Thread threadC = new Thread(printerC);

            threadC.start();
            threadC.join();
        }
    }
}
