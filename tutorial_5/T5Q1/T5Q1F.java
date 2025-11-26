package tutorial_5.T5Q1;

public class T5Q1F {
    public static void main (String [] args){
        int [][] num = {{6,9},{2,5},{4,6}};
         
         for ( int i = 0; i < num.length; i++){
             for (int j = 0; j < num[i].length; j++){
                 System.out.print(num[i][j] + " ");
             }
             System.out.println();
         }
         System.out.println();
         
         num [1][1] = 4;
         num [2][0] = 3;
         num [2][1] = 7;
         
         
         for ( int i = 0; i < num.length; i++){
             for (int j = 0; j < num[i].length; j++){
                 System.out.print(num[i][j] + " ");
             }
             System.out.println();
         }
    }
    
}
