package PracticePrograms.StarPattern;

public class StaraAlfa {
    public static void main(String[] args) {
        // here 65 is the ASCII value of A
        
        for(int i =65 ; i<=70; i++){
            for (int j = 65 ; j <i; j++)

                    System.out.print((char)j);
                    /*char is using for convert value in 
                    integer to alphabet */
                
                System.out.println();

            }
        }
    }

