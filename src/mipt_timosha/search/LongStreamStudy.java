package mipt_timosha.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class LongStreamStudy {
    public static void main(String[] args) {
        List <Long>totalProductsIdList=LongStream.of(5,9,15,2,3,8,9,11).boxed().collect(Collectors.toList());



//        LongStream range = LongStream.range(0, 6);
//        List<Long> collect = range.boxed().collect(Collectors.toList());
//        collect.forEach(System.out::println);

        List<Long> ids = LongStream.range(0, 3)
                .map(x -> totalProductsIdList.get(new Random().nextInt(totalProductsIdList.size())))
                .boxed().collect(Collectors.toList());
        ids.forEach(System.out::println);

    }
}
