package basic.Programs.pattern;

/*
 12345
 12345
 12345
 12345
 12345


 */
public class Program3 {
    public static void main(String[] args) {
        int n = 6;
        for(int row = 1;row<n;row++){
            for(int col=1;col<n;col++){
                System.out.print(col);
            }
            System.out.println();
        }


       
    }
}
