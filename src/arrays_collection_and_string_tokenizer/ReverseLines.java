package arrays_collection_and_string_tokenizer;
/*
 * File: arrays_collection_and_string_tokenizer.ReverseLines.java
 * ----------------------
 * This program reverses the lines of a 2D char array.
 */

public class ReverseLines {

    public void run(){
        System.out.println("This program reverses the lines.");
        printLines(lines);
        lines = reverseLines(lines);
        System.out.println("Reversed Version:");
        printLines(lines);
    }

    //Print given 2D char array contents
    private void printLines(char[][] lines){
        for(int a=0; a<lines.length; a++){
            for(int b=0; b<lines[a].length; b++){
                System.out.print(lines[a][b]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private char[][] reverseLines(char[][] lines){
        char[][] reversed = new char[lines.length][];
        for (int a=0; a<lines.length; a++) {
            reversed[a] = new char[lines[lines.length-a-1].length];
            for (int b=0; b<lines[lines.length-a-1].length; b++) {
                reversed[a][b] = lines[lines.length-a-1][b];
            }
        }
        return reversed;
    }

    private char[][] lines = new char[][] {{'T','h','e',' ','m','u','s','i','c',' ','i','s',' ','r','e','v','e','r','s','i','b','l','e',' ','b','u','t',' ','T','i','m','e',' ','i','s',' ','n','o','t','.'},
            {'C','o','n','g','r','a','t','u','l','a','t','i','o','n','s','.',' ','Y','o','u',' ','h','a','v','e',' ','j','u','s','t',' ','d','i','s','c','o','v','e','r','e','d',' ','t','h','e',' ','s','e','c','r','e','t',' ','m','e','s','s','a','g','e','.'},
            {'M','e','s','s','i','n','\'',' ','w','i','t','h',' ','t','h','i','n','g','s',' ','y','o','u',' ','d','o','n','\'','t',' ','u','n','d','e','r','s','t','a','n','d'},
            {'J','a','v','a',' ','i','s',' ','g','r','e','a','t'}
    };
}