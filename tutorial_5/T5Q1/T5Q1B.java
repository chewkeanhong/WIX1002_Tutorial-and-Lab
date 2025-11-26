package tutorial_5.T5Q1;


public class T5Q1B {
    public static void main (String [] args) {
        char [] alphabet = { 'A', 'B', 'C', 'D', 'E'};
        
        for (int i = 0; i < alphabet.length; i++){
        if (i == alphabet.length -1)
            System.out.println(alphabet[i]);
        else 
            System.out.print(alphabet[i] + ", ");
        }
    }
}
