package tutorial_6;

public class T6Q1E {
    public static void letter_digit_sum(String str){
    int numOfDigit = 0;
    for(int i = 0; i < str.length(); i++){
        if(Character.isDigit(str.charAt(i))){
            numOfDigit++;
        }
    }
    System.out.println("Number of letters : " + (str.length() - numOfDigit));
    System.out.println("Number of digits : " + numOfDigit);
    }
}
