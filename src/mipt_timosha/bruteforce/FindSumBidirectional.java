package mipt_timosha.bruteforce;

import java.util.Arrays;

public class FindSumBidirectional {
    public static void main(String[] args) {
        int[] nums = {3, 8, 15, 17,25,9};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(findIndices(nums,23)));
    }

    public static int[] findIndices(int[] array, int targetNumber) {
        int left = 0;
        int right = array.length - 1;
        System.out.println("First right is "+ right);
        while (left < right) {
            int sum = array[left] + array[right];
            System.out.println("Sum by current indices is " + sum);
            if (sum == targetNumber) {
                return new int[]{left, right};
            } else if (sum < targetNumber) {
                left++;
                System.out.println("left"+left);
            } else {
                right--;
                System.out.println("right"+right);
            }
        }

        return new int[0];
    }

}
