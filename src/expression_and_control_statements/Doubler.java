package expression_and_control_statements;

/*
 * File: Doubler.java
 * -------------------------------------
 * Take an integer input from the user and ask twice of the
 * answer every step until user gives wrong answer
 *
 * Class: Doubler
 * Difficulty: (Medium)
 * Prerequisites: While Loops, ConsoleProgram (readInt, println)
 */

import java.util.Scanner;

public class Doubler {

    public void run(Scanner sc) {
        System.out.print("Give an integer :");
        int newValue = Integer.parseInt(sc.nextLine());
        int oldValue;
        do {
            oldValue = newValue;
            System.out.print("Double the value is: ");
            newValue = Integer.parseInt(sc.nextLine());
        } while (newValue == 2 * oldValue);
    }
}