package arrays_collection_and_string_tokenizer;

/*
 * File: arrays_collection_and_string_tokenizer.PostalLookup.java
 * --------------------------------
 * This program displays the name of a state given its two-letter postal abbreviation.
 */

import java.util.HashMap;
import java.util.Scanner;

public class PostalLookup {

    public void run(Scanner sc) {
        String code;
        HashMap<String,String> stateMap = new HashMap<>();
        initStateMap(stateMap);
        System.out.println("This program displays the name of a state given its two-letter postal abbreviation.");
        System.out.println("Enter an empty string to stop execution");
        System.out.println(stateMap);
        while (true) {
            System.out.print("Enter two-letter state abbreviation: ");
            code = sc.nextLine();
            if (code.equals("")) break;
            if (stateMap.containsKey(code)) {
                System.out.println(code + " = " + stateMap.get(code));
            } else {
                System.out.println("State code not found!");
            }
        }
    }

    private void initStateMap(HashMap<String,String> map) {
        map.put("AL", "Alabama");
        map.put("AK", "Alaska");
        map.put("AZ", "Arizona");
        map.put("FL", "Florida");
        map.put("GA", "Georgia");
        map.put("HI", "Hawaii");
        map.put("WI", "Wisconsin");
        map.put("WY", "Wyoming");
    }
}