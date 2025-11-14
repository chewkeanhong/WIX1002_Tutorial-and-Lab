package pyramid;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pyramid height: ");
        int height = input.nextInt();

        for (int i = 1; i <= height; i++) {
            // print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
             System.out.println(); // move to next line
                   
        }
    }
}
