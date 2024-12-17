/**
 this keyword refrence to the current object
 using this keyword can call another constructor 
 can call function using this 
 When a parameter has the same name as an instance variable,
  the this keyword distinguishes between them.
 Constructor call must be the first statement in a constructorJava(1207959691)

 pass the Current object as paramter??
 */

public class Program2 {
    public static void main(String[] args) {
        // object() /instance 
        Example e1 = new Example();
        Example e3 = new Example(23,45);
        Example e2 = new Example(43);
        System.out.println(e3.y); // 45
        e3.y = 101;
        System.out.println(e3.y); // 101
        System.out.println(e2.y); // 0




    }
}
