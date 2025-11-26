package tutorial_5;

import java.util.Scanner;

public class T5Q4 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter a sentence (count 'the'): ");
        String sentence = input.nextLine();
        String [] arraySentence = sentence.split(" ");
        
        int totalThe = 0;
        for (String word : arraySentence){
            if (word.equals("the")){
                totalThe++;
            }
        }
        System.out.println("The total number of occurrence of the word 'the': " + totalThe);
    }
    
}
