package sorting;


import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] tab = {6, 2, 1, 3, 1};
        bubbleSort(tab);
        System.out.println(Arrays.toString(tab));
    }


    public static void bubbleSort(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int bigger = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = bigger;
                }
            }
        }
    }

}
