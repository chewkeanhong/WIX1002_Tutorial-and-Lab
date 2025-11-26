package tutorial_5;

public class T5Q2 {
    public static void main (String [] args){
        // 2a.
        //Wrong: String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};
        String[] code = {"AAA","AAB","AAC","AAD"};
		
	// 2b.
        /*Wrong: int[] num = new num[10];
                 for(int k=0; k<=num.length(); k++)
                     sum+=num;
        */
	int sum = 0;
	int[] num = new int[10];
	for(int k = 0; k < num.length; k++)
            sum += num[k];
		
	// 2c.
        /*Wrong: int [][]t = new int[3][];
                 t[1][2] = 5;
        */
	int[][] t = new int[3][3];
	t[1][2] = 5;
		
	// 2d.
        /*Wrong: int i=4;
                 int []score = new int[5];
                 score [1] = 78;
                 score[++i] = 100;
        */
	int i = 4;
	int[] score = new int[5];
	score[1] = 78;
	score[i++] = 100;
    
    }
}
