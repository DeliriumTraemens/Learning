package golovach.rabbitattack;

public class LabRabbitAttack {
    public static void main(String[] args) throws InterruptedException{
        for (int k = 0; k < 200; k++) {
            String spaces = spaces(k);
            Runnable printer = new PrintRunnable(spaces + k, 50);
            Thread thread = new Thread(printer);
            thread.start();
            Thread.sleep(20);

        }
    }

    private static String spaces(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += " ";
        }
        return result;
    }

}
