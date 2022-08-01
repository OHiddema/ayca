package arrays_collection_and_string_tokenizer;

import java.util.Arrays;
import java.util.Random;

public class MaxMin {
    private int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int element: array) {
            if (element > max) max = element;
        }
        return max;
    }

    private int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element: array) {
            if (element < min) min = element;
        }
        return min;
    }

    public void run() {
        // generate an array with random integers in range [0..100]
        Random randomInt = new Random();
        int arraySize = 10;
        int[] testArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            testArray[i] = randomInt.nextInt(101);
        }
        System.out.println(Arrays.toString(testArray));
        System.out.println("The maximum element is: " + findMax(testArray));
        System.out.println("The minimum element is: " + findMin(testArray));
    }
}