package randomnumberdisplayer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;

public class RandomNumberDisplayer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomVal = new Random();
        
        //Input from user
        System.out.print("Enter how many random numbers to generate: ");
        int count = input.nextInt();
        
        System.out.print("Enter the minimum value of random number: ");
        int minVal = input.nextInt();
        
        System.out.print("Enter the maximum value of random number: ");
        int maxVal = input.nextInt();
        
        
        int range = maxVal - minVal + 1;
        if (maxVal <= minVal) {
            System.out.println("Error: Maximum value cannot be smaller than or equal to minimum value.");
            return;
        } 
        else if (count > range) {
            System.out.println("Error: Cannot generate " + count + " random numbers between the range.");
            return;
        }
        else {
            System.out.println("\nRandom numbers generated:");
        }

        //Use a Set to store random numbers
        HashSet<Integer> numbers = new HashSet<>();

        while (numbers.size() < count) {
            int randomNum = randomVal.nextInt(range) + minVal;
            numbers.add(randomNum); // Set avoids duplicates automatically
        }

        //Print all random numbers
        int index = 1;
        for (int num : numbers) {
            System.out.println("Number " + index + ": " + num);
            index++;
        }
    }
}
