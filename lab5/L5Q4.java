package lab5;

public class L5Q4 {
    public static void main (String [] args){
        int [][] matrix = {{1,5,7}, {3,6,9}, {5,3,8}};
        
        System.out.println("3 by 3 Matrix");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");  
            }
            System.out.println();
        }
        System.out.println();
        
        int [][] rotatedMatrix = new int [3][3]; 
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                rotatedMatrix [j][2-i] = matrix [i][j];
            }
        }
        
        System.out.println("After rotates 90 degree clockwise");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
