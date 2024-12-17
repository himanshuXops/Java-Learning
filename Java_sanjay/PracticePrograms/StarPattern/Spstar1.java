package PracticePrograms.StarPattern;

public class Spstar1 {
    public static void main(String[] args) {
        int n = 5;
        for(int row =n ; row>=0;row--){
            for(int col = row ; col>=1; col--){
                System.out.print("-"+col);
            }
            System.out.println();
        }
    }
}



// output
// 54321
// 4321
// 321
// 21
// 1