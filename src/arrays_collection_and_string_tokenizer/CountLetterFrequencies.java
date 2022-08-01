package arrays_collection_and_string_tokenizer;

import java.util.Scanner;

public class CountLetterFrequencies {

    public void run(Scanner sc) {

//        Implement a program that takes string lines of inputs from user until a blank line is given.
//        Then count frequency of each letter in the input and print the letter counts.
//        (Note that you should count only letters and may ignore numbers in the input)
//        Hint: Convert each letter to uppercase then start counting

        StringBuilder sb = new StringBuilder();
        System.out.println("Enter lines of text until a blank line is given:");
        String line;
        while (!(line = sc.nextLine()).equals("")) {    // repeat until a blank line is given
            sb.append(line.toUpperCase());              // convert each letter to uppercase
        }

        int[] charCount = new int[26];

        sb.chars()
                .filter(s -> (s >= 65 && s <= 90))      // filter uppercase letters
                .forEach(s -> charCount[s-65]++);       // count uppercase letters

        // output to screen
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > 0) System.out.println((char) (i+65)+ ": " + charCount[i]);
        }
    }
}