
package tutorial_6;

public class T6Q1C {
    public static int combinationFunction(int n, int k){
        int combination = factorial(n) / (factorial(k) * factorial(n-k));
        return combination;
    }
    
    public static int factorial(int num) {
        int result = 1;
        for(int i = 2; i <= num; i++){
        result *= i;
        }
        return result;
    } 
}
