package arrays_collection_and_string_tokenizer;

/*
 * File: arrays_collection_and_string_tokenizer.SumArray.java
 * ----------------------
 * This program generates N random numbers in range(1-10) and store them in an array.
 * Then prints the sum of the array with random numbers.
 */

import java.util.Scanner;

public class SumArray {

    public void run(Scanner sc){

        System.out.print("Please enter array length: ");
        int length = Integer.parseInt(sc.nextLine());
        System.out.print("Please enter largest number: ");
        int max = Integer.parseInt(sc.nextLine());
        int[] array = new int[length];
        fillArrayRandomly(array, max);
        printArray(array);
        System.out.println("Sum = " + sumArray(array));
    }


    //Initialize given array with random numbers in given numberRange
    private void fillArrayRandomly(int[] array, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.floor((max+1)*Math.random());
        }
    }

    //Sum all elements of given array return sum
    private int sumArray(int[] array) {
        int sum = 0;
        for (int element: array) sum += element;
        return sum;
    }

    //Print the elements of the array
    private void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

}