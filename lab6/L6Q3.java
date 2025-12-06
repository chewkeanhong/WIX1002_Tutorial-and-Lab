package lab6;

import java.util.Scanner;

public class L6Q3 {
    public static void main(String[] args) {
        int[] arrayNum = new int[10];
        arrayInput(arrayNum);
        
        System.out.println("Initial number in the array: ");
        for(int each : arrayNum){
            System.out.print(each + " ");
        }
        System.out.println();
        
        reverseNumArray(arrayNum);
        
        System.out.println("Reversed number in the array: ");
        for(int each : arrayNum){
            System.out.print(each + " ");
        }
        System.out.println();
    }
    
    public static void arrayInput(int[] arrayNum){ 
        Scanner input = new Scanner(System.in);
        for(int ct = 0; ct < 10; ct++){
            arrayNum[ct] = input.nextInt();
        }
    }
    
    public static void reverseNumArray(int[] arrayNum){
        for(int i = 0; i < arrayNum.length; i++){
            String strNumber = Integer.toString(arrayNum[i]);
            StringBuilder reversedStr = new StringBuilder(strNumber).reverse();
            int reversed = Integer.parseInt(reversedStr.toString());
            arrayNum[i] = reversed;
        }
    }
}