package mipt_timosha.search;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    private static int[] numbers = {1, 3, 3, 5, 7, 5, 8, 5, 9};

    private static int find(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Arrays.toString(numbers));
        for (int number : numbers) {
            System.out.print(number+"\t");
        }

        System.out.println("\n===============Input number for search===========\n");
        int x = scan.nextInt();
        if (find(numbers, numbers.length, x) > -1) {
            System.out.println("Index of x is: " + find(numbers, numbers.length, x));
        } else System.out.println("Your number is not in the range");

        scan.close();
    }
}
