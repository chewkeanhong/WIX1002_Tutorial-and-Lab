package tutorial_6;
import java.util.Random;

public class T6Q1H {
    public static int randomNmberGeneratedTwice(){
        Random random = new Random();
        int[] numList = new int[11];

        while(true){
        int randomNum = random.nextInt(11);
        numList[randomNum]++;
        if(numList[randomNum] > 1){
            return randomNum;
        }
        }
    }   
}
