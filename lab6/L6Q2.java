package lab6;

public class L6Q2 {
 
    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        System.out.println("Here is a Triangle:");
        int height = 5;

        for (int i = 1; i <= height; i++) {
            multiPrint(height - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
        
        System.out.println(); 

        System.out.println("Here is a Diamond:");
        int rows = 4; 
        
        for (int i = 1; i <= rows; i++) {
            multiPrint(rows - i, ' ');      
            multiPrint(2 * i - 1, '*');     
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            multiPrint(rows - i, ' ');      
            multiPrint(2 * i - 1, '*');     
            System.out.println();
        }
    }
}