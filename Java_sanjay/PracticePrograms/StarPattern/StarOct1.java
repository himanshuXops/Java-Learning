package PracticePrograms.StarPattern;

public class StarOct1 {

    public static void main(String[] args) {

        int n = 7 ;

        for(int row=1; row<n; row++ ){
            for(int col=1 ; col<=n; col++){
               
                System.out.print("*");
            }
             for(int j =1 ; j<=n;j++){
                    System.out.print(j);
                }
            System.out.println();
        }
    }
}