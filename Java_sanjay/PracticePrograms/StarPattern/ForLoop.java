package PracticePrograms.StarPattern;

public class ForLoop {
    public static void main(String[] args) {
    int n =0;
        for(int i =1 ; i<=4; i++){

            for(int j =1; j<=i; j++){
                int value = n+1;
                System.out.print(value);
                n= value;
            }
            System.out.println();
        }
    }
}
