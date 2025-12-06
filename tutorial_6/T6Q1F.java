package tutorial_6;

import java.util.Random;

public class T6Q1F {
    public static void main(String[] args){
        int[] randomNumList = new int[10];
        generateRandomNo(randomNumList);

        for (int num : randomNumList) {
            System.out.print(num + " ");
        }
    }

    public static void generateRandomNo(int[] randomNumList){
        Random random = new Random();
        for(int ct = 0; ct < randomNumList.length; ct++){
            randomNumList[ct] = random.nextInt(101);  
        }
    }
}
 
