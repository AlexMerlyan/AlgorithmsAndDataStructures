package algorithms.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] data = new int[]{5, 3, 4, 9, 6, 10, 100, 89, 65, 1};
        sort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int[] data, int left, int right) {
        if (right - left <= 0) {
            return;
        }
        int partition = partition(data, left, right);
        sort(data, left, partition - 1);
        sort(data, partition + 1, right);
    }

    private static int partition(int[] data, int left, int right) {
        int pivot = data[right];
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (data[++leftPtr] < pivot) ;
            while (rightPtr > 0 && data[--rightPtr] > pivot) ;

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(data, leftPtr, rightPtr);
            }
        }
        swap(data, leftPtr, right);
        return leftPtr;
    }

    private static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

}
