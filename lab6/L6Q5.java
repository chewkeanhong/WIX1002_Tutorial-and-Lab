package lab6;

import java.util.Scanner;
import java.util.Random;

public class L6Q5 {
    public static boolean checkMultiplication (int parameter1, int parameter2, int answer){
        if (parameter1*parameter2 == answer){
            return true;
        }
        else
            return false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int score = 0;
        
        while(true){
            System.out.println("Enter a negative number to quit.");
            int parameter1 = random.nextInt(12)+1;
            int parameter2 = random.nextInt(12)+1;
            System.out.print(parameter1 + " x " + parameter2 + " = ");
            int answer = input.nextInt();
            
            if(answer < 0){
                break;
            }
            
            if(checkMultiplication(parameter1, parameter2, answer))
                score++;              
        }
        
        System.out.println("Your score is " + score);
    }
}
    