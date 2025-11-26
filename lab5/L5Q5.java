package lab5;

import java.util.Scanner;
import java.util.Random;

public class L5Q5 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        Random random = new Random ();
        
        int [] numbers = new int [20];
        
        System.out.println("A list of 20 random integer within 0 to 100");
        for ( int i = 0; i < numbers.length; i++){
            int num = random.nextInt(101);
            numbers[i] = num;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        //Bubble Sort (Sort the array in descending order)
        System.out.println("Array in descending order");
        for ( int pass = 1; pass < numbers.length; pass++ ){
            for (int i = 0; i < numbers.length - 1; i++){
                if (numbers[i] < numbers[i+1]){
                    int hold = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = hold;
                }
            }
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        //Prompt the user to enter a number to search
        System.out.print("Enter a number to search: ");
        int searchNum = input.nextInt();
        
        //Linear Search
        int linearLoop = 0;
        boolean linearFound = false;
        
        for (int j = 0; j < numbers.length; j++){
            if (numbers[j] == searchNum){
                linearFound = true;
                linearLoop = j + 1;
                break;
            }
        }

        //Binary Search
        int low = 0;
        int high = numbers.length -1;
        int binaryLoop = 0;
        boolean binaryFound = false;
        
        while (low <= high){
            binaryLoop++;
            int middle = (low + high) / 2;
            if (searchNum == numbers[middle]){
                binaryFound = true;
                break;
            }
            else if (searchNum < numbers[middle]){
                low = middle + 1;
            }
            else{
                high = middle - 1;
            }   
        }
        
        //Print results of linear search and binary search
        if (linearFound == true){
            System.out.println(searchNum + " found");
            System.out.println("Linear Search - " + linearLoop + " loop(s)");
        }
        else{
            System.out.println(searchNum + "is not found(Linear Search)");
        }
        
        if (binaryFound == true){
            System.out.println(searchNum + " found");
            System.out.println("Binary Search - " + binaryLoop + " loop(s)");
        }
        else{
            System.out.println(searchNum + " is not found(Binary Search)");
        }
        
    }
}
