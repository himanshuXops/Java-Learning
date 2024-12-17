// what is local varible 
// locl variable that is declared inside a method, constructor,
// or block of code (such as a loop or conditional block).
// local you can not the access outside the sc0pe 

/*

A local variable in Java is a variable that is declared inside a method, constructor, or block of code (such as a loop or conditional block). Local variables are only accessible within the method, constructor, or block in which they are declared. Once the method or block finishes executing, the local variable is destroyed, and its value cannot be accessed outside of it.

Key characteristics of local variables:
Scope: Limited to the block, method, or constructor in which they are declared.
Lifetime: Exists only during the execution of the block or method in which they are defined.
Initialization: Local variables must be initialized before they can be used. If you try to use a local variable without initializing it, the compiler will throw an error.
Modifiers: Local variables cannot be marked with access modifiers (like private, protected, or public) because their access is already restricted to the block or method in which they are declared. However, they can be declared as final to prevent modification.

 */
public class Program2 {
    static int xglobalVarible = 10;
    public static void main(String[] args) {
        System.out.println(xglobalVarible);
        printHello();
    }

    // scope when starts curly baces and end braces
    static void printHello(){
        int x = 90;
        System.out.println(x);
        String saveUserData = "Himanshu";

        int localVaribe ; // must be intialized before access
        // System.out.println(localVaribe); // first acess then initialized

        if(x == 90){
            // int x = 23; x already declared outside
            int y = 90;
            System.out.println(y);
            System.out.println(x);
            System.out.println(saveUserData);
        }else if(x == 30){
            // String saveUserData = "Himanshu";
        }else if(x >45){
            // String saveUserData = "Himanshu";

        }
        else{
            // String saveUserData = "Himanshu";
            int y = 0;
            System.out.println(saveUserData);
        }
        // System.out.println(y);// can't access you are accessing if scope variable can't acees outside
    }
}
