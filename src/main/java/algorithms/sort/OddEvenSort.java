package algorithms.sort;

import java.util.Arrays;

public class OddEvenSort {

    public static void main(String[] args) {
        int[] data = new int[] {5, 3, 4, 9, 6, 10, 100, 89, 65, 1};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int data[]) {
        boolean isSorted = false; // Initially array is unsorted

        while (!isSorted) {
            isSorted = true;
            int temp;

            // Perform Bubble sort on odd indexed element
            for (int i = 1; i <= data.length - 2; i = i + 2) {
                if (data[i] > data[i + 1]) {
                    temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    isSorted = false;
                }
            }

            // Perform Bubble sort on even indexed element
            for (int i = 0; i <= data.length - 2; i = i + 2) {
                if (data[i] > data[i + 1]) {
                    temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    isSorted = false;
                }
            }
        }

    }
}
