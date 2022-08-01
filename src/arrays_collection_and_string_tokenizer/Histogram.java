package arrays_collection_and_string_tokenizer;

import java.util.Random;
import java.util.Scanner;

public class Histogram {
    public void run(Scanner sc) {
        System.out.println("This program generates random grades (0-100) and computes its histogram.");
        System.out.print("How many random grades do you want to generate? ");
        Random randomInt = new Random();

        // Don't want to use nextInt -> Generates a problem in main.
        int n = Integer.parseInt(sc.nextLine());

        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            // random grades 0..100 as integers
            grades[i] = randomInt.nextInt(101);
        }
        // aggregate to intervals 0..9, 10..19, etc.
        int[] interval = new int[11];
        for (int grade : grades) {
            interval[grade / 10]++;
        }

        // generate output to screen
        for (int i = 0; i < interval.length - 1; i++) {
            System.out.format("%02d-%02d: ", 10*i, 10*i+9);
            System.out.println("*".repeat(interval[i]));
        }
        System.out.println("  100: " + "*".repeat(interval[interval.length-1]));
    }
}