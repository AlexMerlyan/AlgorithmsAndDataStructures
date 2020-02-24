package algorithms.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] data = new int[]{5, 3, 4, 9, 6, 10, 100, 89, 65, 1};
        data = mergeSort(data);
        System.out.println(Arrays.toString(data));
    }

    private static int[] mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length - left.length];
        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, left.length, right, 0, right.length);

        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int l = 0;
        int r = 0;
        int[] result = new int[left.length + right.length];

        for (int i = 0; i < result.length; i++) {
            if (l >= left.length) {
                result[i] = right[r++];
            } else if (r >= right.length) {
                result[i] = left[l++];
            } else if (left[l] <= right[r]) {
                result[i] = left[l++];
            } else {
                result[i] = right[r++];
            }
        }
        return result;
    }

}
