package mipt_timosha.bruteforce;

public class findDividers {
    static int d = 2;

    static void findDivider1(int x) {
        while (x != 1) {
//                System.out.println("Modal outside If of x "+x+" and d "+d+ " is " + x%d);
            if (x % d == 0) {
                System.out.println("Modal "+ x%d);
                System.out.println("Found Divider is "+d);
                x /= d;
            }  else{
                d++;
            }
        }
    }

    public static void main(String[] args) {
        findDivider1(99);
    }

}
