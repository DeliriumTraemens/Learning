package mipt_timosha.bruteforce;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindSumV2 {
    private static Map<Integer, Integer> map = new HashMap();// Мапка<Число, егоИндекс>


    public static void main(String[] args) {
        int[] nums = {3, 8, 15, 17, 9};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(twoSums(nums, 20)));

    }

    private static int[] twoSums(int[] nums, int target) {
//        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println("iteration #" + (i + 1));
            System.out.println("Map contains " + map);
            System.out.println("Current element of nums[" + i + "] is " + nums[i]);
            System.out.println("Current complement = " + complement + " - is diff of target " + target + "-" + nums[i]+" - and current element");
            checkMap(map, complement);
            if (map.containsKey(complement)) {
                System.out.println("====BINGO====");
                System.out.println("map get " + map.get(complement));
                System.out.println(" current map " + map);
                System.out.println(" current map keys " + map.keySet());
                System.out.println(" current i " + i);
                System.out.println(" current nums[" + i + "] is " + nums[i]);
//
                return new int[]{map.get(complement), i};//кладем в массив Индекс комплемента, и текущий индекс(равный итерации)
            }
            System.out.println("\t proceed with map; current map is " + map);
            System.out.println("\t so we add the number " + nums[i] + " , stored in index " + i);
            map.put(nums[i], i);
            System.out.println("now map is " + map + "\n====================\n");
        }
        return new int[0];
    }

    private static void checkMap(Map<Integer, Integer> map, int complement) {
        if (map.containsKey(complement)) {
            System.out.println("Map contains complement " + complement);
        } else {
            System.out.println("Map not contains complement " + complement + " so we have to");
        }
    }
}
