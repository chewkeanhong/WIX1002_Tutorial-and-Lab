package l3q6_extra.question;

import java.util.Scanner;

public class L3Q6_ExtraQuestion {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Radius : ");
        double radius = input.nextDouble();
        
        System.out.println("Enter a point: ");
        System.out.print("x : ");
        int x = input.nextInt();
        System.out.print("y : ");
        int y = input.nextInt();
        
        System.out.print("Centre of the circle (x-coordinate): ");
        int i = input.nextInt();
        System.out.print("Centre of the circle (y-coordinate): ");
        int j = input.nextInt();
        System.out.println("Coordinate of the centre of circle: "+ "(" + i + "," + j + ")");
        
        double a = Math.pow((x-i),2);
        double b = Math.pow((y-j),2);
        double distance = Math.sqrt(a+b);
        
        System.out.printf("Distance : %.2f%n", distance);
        
        if (distance < radius)
            System.out.println("The point is inside the circle.");
        else if (distance > radius)
            System.out.println("The point is outside the circle.");
        else
            System.out.println("The point is on the circle.");
        
    }
    
}
