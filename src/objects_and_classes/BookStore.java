package objects_and_classes;

import java.io.*;
import java.util.*;

public class BookStore {

    private HashMap<Integer, String> titles;
    private HashMap<Integer, String> authors;

    public void run(Scanner sc) {
        // Read the book records form the file
        readBooks("data//books.txt");
        System.out.println("Read " + titles.size() + " book records from the file.");

        // Asks user repeatedly for a book id and then display the related information
        while (true) {
            System.out.print("Please enter a book id: ");
            String line = sc.nextLine();
            if (line.equals("")) {
                break;
            } else {
                int bookId = Integer.parseInt(line);
                String title = titles.get(bookId);
                if (title == null) {
                    System.out.println("No such book record exists...");
                } else {
                    String author = authors.get(bookId);
                    System.out.println(title + " by " + author);
                }
            }
        }
        System.out.println("Bye.");
    }

    private void readBooks(String bookFile) {
        titles = new HashMap<Integer, String>();
        authors = new HashMap<Integer, String>();

        try (BufferedReader rd = new BufferedReader(new FileReader(bookFile))) {
            while (rd.ready()) {
                String[] items = rd.readLine().split("/");
                int bookId = Integer.parseInt(items[0]);
                String title = items[1];
                String author = items[2];
                titles.put(bookId, title);
                authors.put(bookId, author);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}