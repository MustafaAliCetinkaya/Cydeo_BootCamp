package stringTasks;

import java.util.Scanner;

public class Reverse5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println ("Please enter a sentence. Compiler will reverse it");
        String sentence = input.nextLine ();
        int length = sentence.length ();
        String reverseSentence="";

        for (char i = (char) (length-1); i>=0 ; i--) {
            /*reverseSentence+=sentence.charAt (i);*/
            System.out.print (i);
        }


    }
}
