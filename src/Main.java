import arrays_collection_and_string_tokenizer.*;
import characters_and_strings.*;
import expression_and_control_statements.*;
import objects_and_classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("______Arrays Collection and String Tokenizer_______");
            System.out.println("1. CountLetterFrequencies");
            System.out.println("2. Histogram");
            System.out.println("3. MaxMin");
            System.out.println("4. PostalLookup");
            System.out.println("5. ReverseIntArray");
            System.out.println("6. ReverseLines");
            System.out.println("7. SumArray");
            System.out.println("8. WordCount");
            System.out.println("______Characters and Strings_______________________");
            System.out.println("9. IBAN");
            System.out.println("10. Palindrome");
            System.out.println("11. Reverse");
            System.out.println("______Expressions and control statements___________");
            System.out.println("12. BottlesOfBeer");
            System.out.println("13. Doubler");
            System.out.println("14. IsThisATriangle");
            System.out.println("______Objects and Classes__________________________");
            System.out.println("15. Bookstore");
            System.out.println("16. GradeReport");
            System.out.println("17. Movie");

            System.out.println();
            System.out.print("Select the assignment you want to run: ");

            switch (sc.nextLine()) {
                case "1" -> new CountLetterFrequencies().run(sc);
                case "2" -> new Histogram().run(sc);
                case "3" -> new MaxMin().run();
                case "4" -> new PostalLookup().run(sc);
                case "5" -> new ReverseIntArray().run(sc);
                case "6" -> new ReverseLines().run();
                case "7" -> new SumArray().run(sc);
                case "8" -> new WordCount().run();

                case "9" -> new Iban().run(sc);
                case "10" -> new Palindrome().run(sc);
                case "11" -> new Reverse().run(sc);

                case "12" -> new BottlesOfBeer().run();
                case "13" -> new Doubler().run(sc);
                case "14" -> new IsThisATriangle().run(sc);

                case "15" -> new BookStore().run(sc);
                case "16" -> new GradeReport().run();
                case "17" -> new TestMovie().run(sc);

                default -> System.out.println("This is not an legal option!");
            }

            System.out.print("Try another assignment? (y/n) :");

        } while (sc.nextLine().equals("y"));
        sc.close();
    }
}