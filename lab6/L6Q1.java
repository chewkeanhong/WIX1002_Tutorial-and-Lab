package lab6;

public class L6Q1 {
       public static int TriangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The first 20 triangular numbers are: ");

        for (int i = 1; i <= 20; i++) {
            int result = TriangularNumber(i);
            
            if (i == 20) {
                System.out.print(result + "\n");
            } else {
                System.out.print(result + ", ");
            }
        }
    }
}