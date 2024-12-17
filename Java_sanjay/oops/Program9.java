// Multiple Inheritance (Not Supported with Classes)
//"Diamond Problem." -  ek class multiple class kot extend nhi kr skti agr krna chahti h to interface ka use krenge
// A, B  -   class chahti h in dono ko extend krna chahti h

// super keyword 
// first line pe call kriye
class A{

    int x = 23;
    A(){
        System.out.println("Hello A ");
    }
    A(int x){
        System.out.println("Hello A second constructor ");
    }
    void f1 (){
        System.out.println("A class F1");
    }
    static void stcFun(){
        System.out.println("Static function");
    }
}
class B extends A{
    B(){
        super();
        // super(23); // dont call after first line 
        super.f1();
        
    }
    void f2(){
        stcFun();
        System.out.println(super.x);

    }
}
public class Program9 {
    public static void main(String[] args) {
        A obj  = new A();
        B obj1 = new B();
        A.stcFun();
        obj1.stcFun();
        obj.stcFun();
        

    }
    

}
