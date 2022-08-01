package expression_and_control_statements;

import java.util.Scanner;

public class IsThisATriangle {

    public void run(Scanner sc) {
        System.out.println("Provide the (integer!) length of the edges of the traingle.");
        System.out.print("side 1: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("side 2: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("side 3: ");
        int c = Integer.parseInt(sc.nextLine());
        String not = (a<b+c && b<a+c && c<a+b) ? "" : " not";
        System.out.printf("A triangle with edges (%d,%d,%d) can%s exist.%n", a,b,c,not);
    }
}