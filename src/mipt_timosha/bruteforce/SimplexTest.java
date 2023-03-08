package mipt_timosha.bruteforce;

public class SimplexTest {
    static boolean flag = true;
    static int temp;

    static void primeNumber1(int num) {
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Prime");
        } else
            System.out.println("Non Prime");
    }

    static void simpleTest1(int x) {
        for (int i = 2; i < x; ++i) {

            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Simple number");
        } else System.out.println("Non Simple");
    }

    public static void main(String[] args) {
        simpleTest1(61);
        primeNumber1(12);
    }

}
