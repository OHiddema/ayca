package characters_and_strings;

import java.util.Scanner;

public class Reverse {
    public void run(Scanner sc) {
        while (true) {
            System.out.print("Enter a string: ");
            String word = sc.nextLine();
            if (word.equals("")) return;
            System.out.println("The reverse of \"" + word + " is \"" + reverseWord(word) + "\"");
        }
    }

    public String reverseWord(String word) {
        String revWord = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            revWord += word.charAt(i);
        }
        return revWord;
    }
}

