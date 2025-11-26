package tutorial_5;

public class T5Q3 {
    public static void main(String[] args){
        int[] marks = new int[5];
        int i = 0, j = 1;
        marks[i] = 12;
        marks[j] = marks[i] + 19;
        marks[j-1] = marks[j] * marks [j];
        marks[j*3] = marks[i+1];
        marks[++j] = marks[i]%5;
        marks[2*j] = marks[j-1];
        
        System.out.print(marks[0] + " " + marks[1] + " " + marks[2]+ " " + marks[3] + " " + marks[4] +"\n");
        //marks = {961, 31, 1, 31, 31}
    }
    
}
