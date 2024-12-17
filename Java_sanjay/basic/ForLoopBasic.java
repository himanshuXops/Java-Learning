package basic;

// to execute multiple code of block use for loop
/*
for (initialization; condition; increment/decrement) {
    // Code to be executed
}


*/ 
public class ForLoopBasic {
    public static void main(String[] args) {

        for(int i = 0; i<=5; i++){
            System.out.println("Hello World ");
        }
        System.out.println();

        // print 1 to 5 
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println(i);
        }
        System.out.println();

        // print 2 ki table 
        for(int i = 2; i<=20;i = i +2){
            System.out.println("i = " + i);
            // i = i + 1;
        }

        //12345
        for(int i = 1; i<=5; i++){
            System.out.print(i);
        }
        // 1 to 20
        // print number is Even - i  or odd - 1
        System.out.println("");
        
        int a = 22;

        if (a%2 != 0) {
            System.out.println(a + " is odd ");
            
        } else {
            System.out.println(a+ " is even");
        }
    //   *odd even code for using forloop with help of if and else statement
        for(int i=1; i<=20 ; i++){
            // System.out.println(i);
            if(i%2!=0){
                System.out.println(i+ " is odd");
            }else{
                System.out.println(i+ " is even");
            }
            
        }
        System.out.println();

        for(int i=20; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("print 5 table");
        int num = 10;
        for(int i = 1 ; i<=10; i++){
            int result = i * 5;
            System.out.println( num  + "*" + i + '=' + result);
        }

        // program to print 1 to n natural numbers
        int result = 0; 
        int n = 5;
        for(int i = 1 ; i <=n; i++){
            result = result + i;
        }
        System.out.println("result ="+ result);

        


    }
}
/*
12345
12345
12345
12345
12345
 */