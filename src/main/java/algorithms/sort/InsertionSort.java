package algorithms.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] data = new int[] {5, 3, 4, 9, 6, 10, 100, 89, 65, 1};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    static void sort(int[] data, int left, int right) {
        for (int i = left; i <= right; i++) {
            int temp = data[i];
            int j = i;
            while (j > 0 && data[j-1] > temp) {
                data[j] = data[j-1];
                j--;
            }
            data[j] = temp;
        }
    }



}
