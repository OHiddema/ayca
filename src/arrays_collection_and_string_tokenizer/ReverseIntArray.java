package arrays_collection_and_string_tokenizer;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseIntArray {

    public void run(Scanner sc) {
        int n;
        System.out.print("How many numbers does the array have? ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Give the " + n + " numbers, one on each line:");
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            intList.add(Integer.parseInt(sc.nextLine()));
        }
        System.out.println("Original array:" + intList);

        ArrayList<Integer> tempList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            tempList.add(intList.get(n-i-1));
        }
        for (int i = 0; i < n; i++) {
            intList.set(i, tempList.get(i));
        }

        System.out.println("Reversed array: " + intList);
    }
}