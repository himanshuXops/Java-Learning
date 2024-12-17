public class Exam1 {
    int x = 3 ;
    int a = 1;
    int b = 2 ;

    Exam1 (){
        System.out.println("x="+x);  
    }

    Exam1(int a , int b ){
        System.out.println("x="+a + "y="+b);

    }

    Exam1(int a , int b , int c ){
        this.a = a ;
        System.out.println("");
    }

    Example retyr (int a ){
        this.a = a ;
        Example e1  = new Example();
        return e1;
    }
}
