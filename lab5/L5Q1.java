

import java.util.Scanner;
import java.util.Random;

public class L5Q1 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        Random random = new Random ();
        
        System.out.print("Enter the number of students, N: ");
        int N = input.nextInt();
        
        int [] scores = new int [N];
        
        for ( int i = 0; i < scores.length; i++){
            scores[i] = random.nextInt(101);
            System.out.println("Score " + (i+1) + ": " + scores[i]);
        }
        
        int highestScore = scores[0];
        int lowestScore = scores [0];
        int sum = 0;
        
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > highestScore){
                highestScore = scores[i];
            }
            
            if (scores [i] < lowestScore){
                lowestScore = scores[i];
            }
            sum+= scores[i];
        }
        double average = (double) sum / N;
        
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.printf("Average Score: %.2f%n", average);
        
    }
}

