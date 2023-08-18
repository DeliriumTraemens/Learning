package arkhipov.multithread.forkjoinpool;

import java.util.Date;

public class FirstCount {
    private static long number=10_000_000_000L;
    public static void main(String[] args) {
        System.out.println(new Date());

        long j=0L;
        for (long i = 0; i < number ; i++) {
            j+=i;
        }
        System.out.println();
        System.out.println(new Date());
    }
}
