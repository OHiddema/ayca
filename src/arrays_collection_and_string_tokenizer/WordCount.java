package arrays_collection_and_string_tokenizer;

/*
 * File: arrays_collection_and_string_tokenizer.WordCount.java
 * ----------------------------
 * Read input.txt and print each line preceded by its word count.
 */

import java.io.*;

public class WordCount {

    private static final String fileName = "data\\input.txt";

    public void run() {

        try (BufferedReader bf = new BufferedReader(new FileReader(fileName))) {
            while (bf.ready()) {
                String line = bf.readLine();
                System.out.println(line.split(" ").length + " " + line);
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}