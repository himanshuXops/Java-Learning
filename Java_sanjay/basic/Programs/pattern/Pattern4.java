package basic.Programs.pattern;
/***
  12345
  1234
  123
  12
  1 


 */
public class Pattern4 {
    public static void main(String[] args) {
        int n = 6;
        for(int row = n ;row>=1;row--){
            for(int col = 1;col<row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
