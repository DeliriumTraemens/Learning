package mipt_timosha;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{60, 1, 25, 2, 48, 15, 3, 7, 4, 89, 170, 45, 27, 150, 9};
        int min;
        boolean isSorted = false;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\n==============================");

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
            System.out.println("");

        }

    }

}
