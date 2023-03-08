package arkhipov.algorithmes.sort;

import java.util.Arrays;

public class SortingPeack {



    public static void main(String[] args) {
        int[] array = new int[]{60, 1, 25, 2, 48, 15, 3, 7, 4, 89, 170, 45, 27, 150, 9};
            System.out.println(Arrays.toString(array) + "===== Initial array");

        for (int step = 0; step < array.length; step++) {

            int index = min(array, step);

            int tmp = array[step];
            array[step] = array[index];
            array[index]=tmp;

            System.out.println(step+"\t"+ Arrays.toString(array));
        }
    }

    private static int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }



}
