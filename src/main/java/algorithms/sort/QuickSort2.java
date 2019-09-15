package algorithms.sort;

import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args) {
        int[] data = new int[]{5, 3, 4, 9, 6, 10, 100, 89, 65, 1};
        sort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int[] data, int left, int right) {
        if (right - left + 1 <= 3) {
            manualSort(data, left, right);
        } else {
            int partition = partition(data, left, right);
            sort(data, left, partition - 1);
            sort(data, partition + 1, right);
        }
    }

    private static void manualSort(int[] data, int left, int right) {
        int size = right - left + 1;
        if (size <= 1) {
            return;
        }
        if (size == 2) {
            if (data[left] > data[right]) {
                swap(data, left, right);
            }
        } else {
            if (data[left] > data[right-1]) {
                swap(data, left, right-1);
            }
            if (data[left] > data[right]) {
                swap(data, left, right);
            }
            if (data[right -1] > data[right]) {
                swap(data, right -1 , right);
            }
        }
    }

    private static int partition(int[] data, int left, int right) {
        int pivot = median(data, left, right);
        int leftPtr = left - 1;
        int rightPtr = right - 1;
        while (true) {
            while (data[++leftPtr] < pivot) ;
            while (data[--rightPtr] > pivot) ;

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(data, leftPtr, rightPtr);
            }
        }
        swap(data, leftPtr, right - 1);
        return leftPtr;
    }

    private static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    private static int median(int[] data, int left, int right) {
        int center = (left + right) / 2;
        if (data[left] > data[center]) {
            swap(data, left, center);
        }
        if (data[left] > data[right]) {
            swap(data, left, right);
        }
        if (data[center] > data[right]) {
            swap(data, center, right);
        }

        swap(data, center, right - 1);
        return data[right - 1];
    }

}
