package tutorial_6;

import java.util.Random;
public class T6Q2 {
    public static void DecreasingOrder (int a, int b, int c){
       if(a > b && a > c){
            if(b > c)
                System.out.println("Three numbers in decreasing order: " + a + ", " + b + ", " + c);
            else
                System.out.println("Three numbers in decreasing order: " + a + ", " + c + ", " + b);
        }
        else if(b > a && b > c){
            if(a > c)
                System.out.println("Three numbers in decreasing order: " + b + ", " + a + ", " + c);
            else
                System.out.println("Three numbers in decreasing order: " + b + ", " + c + ", " + a);
        }
        else {
            if(a > b)
                System.out.println("Three numbers in decreasing order: " + c + ", " + a + ", " + b);
            else
                System.out.println("Three numbers in decreasing order: " + c + ", " + b + ", " + a);
        }
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        int [] numArray = new int [3];
        
        for (int i=0; i<numArray.length; i++){
            numArray[i] = random.nextInt(101);
        }
        System.out.println("The three numbers are "+ numArray[0] +", " + numArray[1] + ", " + numArray[2]);
        DecreasingOrder(numArray[0],numArray[1],numArray[2]);
    }
}
