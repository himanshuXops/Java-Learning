package basic;

public class BranchingBasic {
    public static void main(String[] args) {
       
        // if else block 
        /* 
        if(true){
           System.out.println("WHen condition of if block is true"); 
        }
        else{
            System.out.println("WHen condition of if block is false"); 
        }

        */

        int value = 0;

        if(value !=0){
            System.out.println("if block running"); 
         }
         else{ 
             System.out.println(" else bloack running"); 
         }

         boolean x = false;
         boolean y = false;
         if (x) {
            System.out.println("if block running"); 
         }else if(y){
            System.out.println("else if block running"); 
         }
         else{
            System.out.println("else block running"); 
         }

         int a = 2;
         int b = 3;
         int c = 4;


         if (a>b && a>c) {
            System.err.println("a is largest number");
            
         } if (b>a && b>c) {
            System.err.println("b is the largest number");
         }
         else {
            System.out.println("c is the largest number");
         }
        


    }
}
