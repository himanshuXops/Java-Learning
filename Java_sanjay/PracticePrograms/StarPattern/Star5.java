package PracticePrograms.StarPattern;

public class Star5 {
    public static void main(String[] args) {

        int n = 6;
        for(int  row= 1 ; row <n ; row++){
            for(int col = 1;col<=row; col++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        System.out.println("himanshu");
    }

}



// output
// 6     
// 65    
// 654   
// 6543  
// 65432 
// 654321