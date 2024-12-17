package PracticePrograms;

public class Star2 {
    public static void main(String[] args) {
        
        int n = 1;
        for(int  row= 7 ; row >=n ; row--){
            for(int col = 6;col>=row; col--){
                System.out.print(col);
            }
            
            System.out.println();
        }
         
    }
}



// output is 


// 123456
// 12345
// 1234
// 123
// 12
// 1