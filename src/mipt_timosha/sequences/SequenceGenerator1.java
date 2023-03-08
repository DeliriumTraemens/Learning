package mipt_timosha.sequences;

public class SequenceGenerator1 {
    static int rangeGen1(int amount, int start, int end, int step) {
        int[] array = new int[amount];
        int x = start;
        array[0] = start;
        while (x <= end) {
            x += step;
        }
        return 0;
    }

    static void rangeGen2(int start, int stop, int step) {
        int x = start;
        while (x < stop) {
            System.out.print((x) + " ");
            x += step;
        }
    }

    static void rangeGen3(int start, int stop, int step) {
        for (int i = start; i < stop; i += step) {
            System.out.print(i + " ");
        }
    }

    static void rangeGen4(int start, int stop, int step) {
        int a = stop - start;
        int b = stop + a;
        int d = a % b;
        for (int i = start; i < stop; i += (a * i + b) % d) {
            System.out.print(i + " ");
        }
    }

    static void rangeGen5(int start, int stop, int step) {
        int count = 1;
        for (int x = 0, y = 20; x <= y; x++, y--) {
//            System.out.print(" start: " + (Integer.valueOf(start+stop)) + " stop: " + stop+1 + " x: " + x + " y: " + y);
            System.out.println(x + " " + y);
            count++;
        }
        System.out.println("\nCount= " + count);
    }

    static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    static int min(int x, int y) {
//        int a ,b;
//        a=b=1+x;
        return (x < y) ? x : y;
//        if(x < y){
//            return x;
//        } else {
//            return y;
//        }
    }

    public static void main(String[] args) {
        rangeGen2(0, 50, 7);
        System.out.println("");
        rangeGen3(0, 70, 7);
        System.out.println("\n====rangeGen4===");
        rangeGen4(5, 80, 7);
        System.out.println("\n====rangeGen5===");
        rangeGen5(5, 80, 7);
    }

}
