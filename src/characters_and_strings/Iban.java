package characters_and_strings;

import java.util.Scanner;

public class Iban {
    public void run(Scanner sc) {
        System.out.print("Give a Turkish IBAN: ");
        String strIBAN = sc.nextLine();

         if (strIBAN.matches("TR\\d{7}0\\d{16}")) {
             System.out.println("This is a valid Turkish IBAN");
         } else {
             System.out.println("This is NOT a valid Turkish IBAN");
         }
    }
}