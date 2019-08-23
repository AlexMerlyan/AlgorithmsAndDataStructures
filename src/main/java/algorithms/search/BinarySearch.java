package algorithms.search;

import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 14, 15, 25, 40, 41, 100, 101};
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            // Random in range [1...101]
            int searchKey = random.nextInt((101 - 1) + 1) + 1;
            System.out.println("Finding number " + searchKey + "...");
            if (binarySearch(searchKey, data) == 0) {
                System.out.println("Number was not found");
            } else {
                System.out.println("Number was found successfully");
            }
            System.out.println();
        }
    }

    private static int binarySearch(int searchKey, int[] data) {
        int lowerBound = 0;
        int upperBound = data.length - 1;
        int operationCounter = 0;

        while (true) {
            operationCounter++;
            int currentPosition = (lowerBound + upperBound) / 2;
            if (data[currentPosition] == searchKey) {
                System.out.println("Operations: " + operationCounter);
                return data[currentPosition];
            } else if (lowerBound >= upperBound) {
                System.out.println("Operations: " + operationCounter);
                return 0;
            } else {
                if (data[currentPosition] > searchKey) {
                    upperBound = currentPosition - 1;
                } else if (data[currentPosition] < searchKey) {
                    lowerBound = currentPosition + 1;
                }
            }
        }
    }

}
