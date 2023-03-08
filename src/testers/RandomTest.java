package testers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class RandomTest {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList();
                IntStream ints2 = new Random().ints(10, 0, 150000);
                ints2.forEach(intList::add);
//                ints2.forEach(System.out::println);
        System.out.println("============---==========");
        System.out.println(intList);

        System.out.println("============ThreadLocal==========");
        List<Integer> ints5=new ArrayList();
        IntStream ints4 = ThreadLocalRandom.current().ints(10, 0, 150000);

        ints4.forEach(ints5::add);
        System.out.println(ints5);
    }

}
