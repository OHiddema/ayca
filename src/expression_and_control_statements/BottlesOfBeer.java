package expression_and_control_statements;

/*
 * File: BottlesOfBeer.java
 * ------------------------
 * This program prints out the lyrics to the song
 * "99 Bottles of Beer on the Wall."  For testing
 * purposes, the constant should be reduced to a
 * smaller value.
 */

public class BottlesOfBeer {

    public void run() {
        String bString;
        int bottles = MAX_BOTTLES;
        do {
            bString = (bottles > 1) ? " bottles " : " bottle ";
            System.out.println(bottles + bString + "of beer on the wall");
            System.out.println(bottles + bString + "of beer");
            System.out.println("You take one down, pass it around");
            bottles--;
            if (bottles > 1) System.out.println(bottles + " bottles of beer on the wall");
            if (bottles == 1) System.out.println("Only one bottle of beer on the wall");
            if (bottles == 0) System.out.println("No more bottles of beer on the wall");
            System.out.println();
        } while (bottles > 0);
    }

    /* Private constants */
    private static final int MAX_BOTTLES = 4;

}