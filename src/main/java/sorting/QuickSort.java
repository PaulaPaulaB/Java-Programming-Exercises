package sorting;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {

        int[] tab = {3, 2, 6, 7, 2, 9, 0, 1};

        int leftPointer = 0;
        int rightPointer = tab.length - 1;

        quickSort(tab, leftPointer, rightPointer);

        System.out.println(Arrays.toString(tab));

    }


    public static void quickSort(int[] inputArray, int low, int high) {

        int middle = low + (high - low) / 2;

        int pivot = inputArray[middle];

        int i = low, j = high;

        while (i <= j) {
            while (inputArray[i] < pivot) {
                i++;
            }

            while (inputArray[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
                i++;
                j--;
            }

            if (low < j)
                quickSort(inputArray, low, j);

            if (high > i)
                quickSort(inputArray, i, high);
        }
    }


}
