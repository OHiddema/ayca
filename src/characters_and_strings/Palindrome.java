package characters_and_strings;

import java.util.Scanner;

public class Palindrome {
    public void run(Scanner sc) {
        while (true) {
            System.out.print("Enter a string: ");
            String word = sc.nextLine();
            if (word.equals("")) return;
            if (isPalindrome(word)) {
                System.out.println("That string is a palindrome.");
            } else {
                System.out.println("That string is a not palindrome.");
            }
        }
    }

    public boolean isPalindrome(String word) {
        for (int i = 0; i < word.length()/2 - 1; i++) {
            if (word.charAt(i) != word.charAt(word.length()-i-1)) return false;
        }
        return true;
    }
}
