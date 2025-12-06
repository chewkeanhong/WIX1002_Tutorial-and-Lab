package tutorial_6;

public class T6Q1D {
    public static boolean pentagonalNumDetector(int num){
    int a = 3;
    int b = -1;
    int c = num*2;
    
    double discriminant = b * b - 4 * a * c;
    
    if (discriminant < 0) {
        return false;
    } 
    else if (discriminant == 0) {
        double root = -b / (2 * a);
        if(isWholeNumber(root) && root > 0){
            return true;
        }
    } 
    else {
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        if(isWholeNumber(root1) && root1 > 0){
            return true;
        }
        if(isWholeNumber(root2) && root2 > 0){
            return true;
        }
    }
    return false;
    }
    
    public static boolean isWholeNumber(double number) {
    double epsilon = 1e-10;
    return Math.abs(number - Math.round(number)) < epsilon;
  }  
}
