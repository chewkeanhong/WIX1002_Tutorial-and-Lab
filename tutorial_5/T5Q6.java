package tutorial_5;

import java.util.Random;

public class T5Q6 {
    public static void main(String [] args){
        Random random = new Random();
        
        int num = random.nextInt(256);
        System.out.println("Random number generated: " + num);
        
        int [] binary = new int [8];
        
        
        for (int i = 7; i >= 0; i--) {
            binary[i] = num % 2;
            num /= 2;
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }
}
