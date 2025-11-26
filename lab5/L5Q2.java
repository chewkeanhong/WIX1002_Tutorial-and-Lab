package lab5;

import java.util.Random;

public class L5Q2{
    public static void main (String[] args){
        Random random = new Random();
        
        int [] numbers = new int[10];
        int count = 0;
        
        while (count < 10){
           int num = random.nextInt(21);
           boolean duplicate = false;
           
           for (int i = 0; i < numbers.length; i++){
               if (numbers[i] == num){
                   duplicate = true;
                   break;
               }   
           }
           
           if (!duplicate){
               numbers[count] = num;
               count++;
           }
        }
        System.out.println("10 non-duplicate random integers within the range from 0 to 20: ");
        for (int i = 0; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
