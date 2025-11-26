package lab5;
import java.util.Scanner;
import java.util.Random;

public class L5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of employees: ");
        int N = input.nextInt();

        int[][] hours = new int[N][7];

        for (int i = 0; i < N; i++) {
            for (int day = 0; day < 7; day++) {
                hours[i][day] = random.nextInt(8) + 1;
            }
        }
        
        System.out.println("Work Hours for Each Employee (7 Days):");

        for (int i = 0; i < N; i++) {
            int total = 0;
            System.out.print("Employee " + (i + 1) + ": ");

            for (int day = 0; day < 7; day++) {
                System.out.print(hours[i][day] + " ");
                total += hours[i][day];
            }

            System.out.println("  Total = " + total + " hours");
        }
    }
}

