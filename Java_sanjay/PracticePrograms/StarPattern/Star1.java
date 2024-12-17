package PracticePrograms.StarPattern;

public class Star1 {
    public static void main(String[] args) {
        int n = 5;
        for (int row =n; row>=1; row--){
           for (int col =5; col>=row; col--){
             System.out.print(col);

            }
              System.out.println();
        }
    }
    
}


// output is 
// 5
// 54
// 543
// 5432
// 54321