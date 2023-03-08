package arkhipov.algorithmes.search;

public class SearchMinInArray {
    public static void main(String[] args) {
        int[] array = new int[]{60, 1, 25, 2, 48, 15, 3, 7, 4, 89, 170, 45, 27, 150, 9};

        int minValue = array[0];
        int minIndex = 0;
        int maxValue = array[0];
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
            if(array[i] > maxValue){
                maxValue = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Minimal Value is " + minValue);
        System.out.println("Minimal Value is at " + array[minIndex] + " at position " + minIndex+"\n\tAnd");

        System.out.println("Maximal Value is " + maxValue);
        System.out.println("Maximal Value is at " + array[maxIndex] + " at position " + maxIndex);
    }

}
