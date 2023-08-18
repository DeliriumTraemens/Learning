package mipt_timosha.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    private static int[] numbers = {1, 3, 3, 5, 7, 8, 9, 10, 12, 12, 14, 15, 50, 52, 55, 80};

    private static int leftBound(int[] arr, int length, int forSearch) {
        int left = -1; // Believe  Arr[left] < x
        int right = length; // Arr[right] >= x

        while (right - left > 1) {
            int middle = (left + right) / 2;
            if (arr[middle] < forSearch) {
                left = middle;
            } else
                right = middle;
        }

        return left;
    }

    public static int find(int[] arr, int length, int forSearch){
        int left=leftBound(arr, length, forSearch);
        int potentialFirstIndexOfForSearchInArr=left+1;
        if ((potentialFirstIndexOfForSearchInArr < length) && arr[potentialFirstIndexOfForSearchInArr]==forSearch) {
            return potentialFirstIndexOfForSearchInArr;
        } else
            return -1;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int number : numbers) {
            System.out.print(number + "\t");
        }

        System.out.println("\n===============Input number for search===========\n");
        int x = scan.nextInt();

        int leftBoundary = leftBound(numbers, numbers.length, x);
        int potentialIndex = find(numbers, numbers.length, x);
        int arrEl = numbers[leftBoundary];
        int arrIndex = numbers[leftBoundary+1];
        System.out.println("Left boundary of " + x + " is numbers[" + leftBoundary + "] : (" + arrEl + ")");
        System.out.println("potentialIndex of " + x + " is " + potentialIndex + ": (" + arrEl + ")");

        scan.close();
    }
}
