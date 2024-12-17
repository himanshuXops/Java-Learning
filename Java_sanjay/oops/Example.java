public class Example {
    int x = 23;
    int y ;

    // default Constructor 
    Example(){
        System.out.println("default constructor ");
    }
    Example(int x, int y){
        this(); // 
        this.x = x;
        this.y = y;
        // int x = 90; error 
        System.out.println("paramtemr  constructor x =" + x + "y=" + y);
    }
    Example(int x){
        this(23, 45);
        this.x = x;
        this.method1();
        System.out.println("paramter constructor x =" + x + "y = " + y);
        // return 34; error 
    }



    Example myEx(){
        
        return this ;
    }
    void method1(){
        System.out.println("x = " + x);
    }
}
