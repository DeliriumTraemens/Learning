package mipt_timosha;

public class FoolSorting {
    static int[] array = new int[]{20, 50, 80, 30, 90, 10, 15, 2, 75, 200, 150, 3, 59, 80, 98, 150, 3, 92, 8, 52, 65, 12, 54, 32};
    static int[] arrayBubble = new int[]{50, 10, 20, 30, 90, 60, 70, 80};
    static int[] arrayBubble2 = new int[]{20, 50, 80, 30, 90, 10, 15, 2, 75, 200, 150, 3, 59, 80, 98, 150, 3, 92, 8, 52, 65, 12, 54, 32};
    static int[] array2 = new int[]{20, 22, 30, 33, 40, 45, 70, 73, 90};
    static int fullCounter = 1;
    static int fullCounterTotal = 1;
    static int bubbleCounterOuter = 1;
    static int bubbleCounterInner = 1;
    static int bubbleTotalSteps = 1;

    static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("]\n");
    }

    static boolean isAscChecker(int[] array) {
        int i = 0;
        while (i < (array.length - 1)) {
            if (array[i] > array[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    static int baypassCounter = 0;//Может быть помещена в тушку метода

    static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            bubbleCounterOuter++;
            bubbleTotalSteps++;
            isSorted = true;
            for (int i = 1; i < array.length - baypassCounter; i++) {
                if (array[i - 1] > array[i]) {

                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;

                    isSorted = false;
                    bubbleCounterInner++;
                    bubbleTotalSteps++;
                }
            }
            printArray(arrayBubble);
            baypassCounter++;
        }
    }

    static void fullSort(int[] array) {
        int i = 0;
        while (i < (array.length - 1)) {
            if (array[i] > array[i + 1]) {
//                swap(array[i], array[i+1]);// Если непорядок
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                i = 0;
                fullCounter++;
                fullCounterTotal++;
            } else //Тут порядок, проходим дальше
                i++;
            fullCounterTotal++;
        }
//        return true;
    }

    private static void swap(int i, int i1) {
        int tmp = i1;
        i1 = i;
        i = tmp;
    }

    public static void main(String[] args) {
        printArray(array);
        arrayChecker(array);
        fullSort(array);
        printArray(array);
        arrayChecker(array);
        System.out.println("Array contains " + array.length + " elements");
        System.out.println("Numbers of InnerHops is " + fullCounter);
        System.out.println("Numbers of TotalHops is " + fullCounterTotal);
        System.out.println("===== BubbleSort =====");
        printArray(arrayBubble);
        System.out.println("---DoSorting----");
        bubbleSort(arrayBubble);
        printArray(arrayBubble);
        arrayChecker(arrayBubble);
        System.out.println("Array contains " + arrayBubble.length + " elements");
        System.out.println("Number of Outer steps is " + bubbleCounterOuter);
        System.out.println("Number of Inner steps is " + bubbleCounterInner);
        System.out.println("Number of Total bubble steps is " + bubbleTotalSteps);
        System.out.println("BypassCounter is " + baypassCounter);
    }

    private static void arrayChecker(int[] array) {
        if (isAscChecker(array)) {
            System.out.println("Array is sorted");
        } else
            System.out.println("Array is unordered");
    }

}
