package tutorial_6;

public class T6Q1B {
    public static boolean squareDetector(int num){
    int low = 1;
    int high = num / 2 + 1;  
    
    while(low <= high){
        int mid = (low + high) / 2;
        if (mid*mid == num){
            return true;
        }
        
        else if (mid*mid > num){
            high = mid - 1;
        }
        
        else {
            low = mid + 1;
        }
    }
    return false;
    }
}
