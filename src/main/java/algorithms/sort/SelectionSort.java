package algorithms.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = new int[] {5, 3, 4, 9, 6, 10, 100, 89, 65, 1};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }

}
