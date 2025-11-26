package lab5;

import java.util.Scanner;

public class L5Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows of Pascal Triangle to generate: ");
        int row = input.nextInt();

        int[][] pascalTriangle = new int[row][row]; 

        // Build Pascal Triangle
        for (int i = 0; i < row; i++) {
            pascalTriangle[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
            }
        }

        // Print the Pascal Triangle
        System.out.println("The Pascal Triangle with " + row + " row(s)");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

