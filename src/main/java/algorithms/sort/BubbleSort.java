package algorithms.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = new int[] {5, 3, 4, 9, 6, 10, 100, 89, 65, 1};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (data[j] < data[j - 1]) {
                    int temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

}
