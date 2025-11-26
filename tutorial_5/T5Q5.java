package tutorial_5;

import java.util.Scanner;

public class T5Q5 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter a sentence (to reverse): ");
        String sentence = input.nextLine();
        
        String [] arraySentence = sentence.split(" ");
        
        for ( int i = arraySentence.length - 1; i >= 0; i--){
            for ( int j = arraySentence[i].length() - 1; j>= 0; j--){
                System.out.print(arraySentence[i].charAt(j));
            }
        }
    }
}
    