public class Program1 {
    public static void main(String[] args) {
        // myFirstFunction();
        // int result = f1();
        // System.out.println(result);
        System.out.println(addTwoNumber(23,34));

        fun1();
        
        ex(addPlusTwo(23, 34));
    }
    static void ex(int x){

        System.out.println("Hello World" + x);
    }

    static void add1(int x, int y){
        int result =  addPlusTwo(x, y);
        System.out.println(result);
    }
    static int addPlusTwo(int x, int y){
        int result = x + y + 2;
        return result;
    }








    static void fun1(){
        fun3();
        System.out.println("this is f1");
    }

    static void fun2(){
        System.out.println("this is f2");
    }
    static void fun3(){
        fun2();
        System.out.println("this is f3");
    }







    static int   addTwoNumber(int x, int y){
        myFirstFunction();
        int result = x + y;
        return result;
    }

    static void myFirstFunction(){
        System.out.println("Hello this is My first function");
        // return 23;
    }
    static int  f1(){
        int  x = 23;
        return x;
        // System.out.println("Hello this is My first function");//Program1.java:15: error: unreachable statement
    }

    //  function/method :- is block of code that can be called at multiple place,
     // and this can be reused
     // int,char,float, bool,String, double , void 
     /**
      * Syntax 
      paramName - IS Parameter
      returnDataType FunctionName(datype paramName){
         // locgic 
         // 
         // ...
         return value ( optional if type is void datatype)
      } 
      */

}
