package PracticePrograms.StarPattern;

public class Star8 {
    public static void main(String[] args) {
          int n =6;
        for(int row = 6; row>=0; row--){
            for(int col =row; col>=n; col--){

                System.out.print(col);

            }

            System.out.println();
        }
    }
}
