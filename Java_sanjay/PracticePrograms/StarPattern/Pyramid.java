package PracticePrograms.StarPattern;

public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 0 ; row<n ; row ++){
        

            for(int col = n-row ; col>1; col--){


                System.out.print(" ");   // for space print
            }

            for(int col = 0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
