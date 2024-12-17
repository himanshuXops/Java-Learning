// import oops;

//java rule : ek file me ek hi public class hoti h
//jo class public hogi usi name se file bnnni chahiye

// default class - public nhi likha class k aage to default classs hogi, package k bahr acces nhi hogi 
// public class - is directory or packag me  or  package se bahr bhi access hogi 
class A{
    // instance variable 1
    // // Non-static variable
    // har object k liye alg bnta 
    // object k name se acees  krna h
    int x = 90;
    int y  = 910;
    // static varible // class varible 
    // direct acees by class name 
    // hr object k liye same hoga 
    // className.staticPropertyname 
    static String bankName = "SBI";
    
    // static function pe use call  ClassName.functionname()
    static void getBankName(){
        bankName = "Axis";
        System.out.println(bankName);
    }
    

    // class me method bolte 
    int getX(){
        return x;
    }
    
    
}
class B{
    // A class ka instance kase bnaye 
    A  a1 = new A();
    
    void f1(A  a){
        a.getX();
    }
}
// class CAr {
//     String color;
//     static String comapayny = "tata";
    
//     {
//         System.out.println("init block");
//     }
    
//     static {
//         System.out.println("static init block " + comapany);
//     }
    
    
// }

public class Program5 {
     int x = 910; // 
    public static void main(String[] args) {
        A  a = new A();
        A  a1 = new A();

        System.out.println(a.getX());
        System.out.println(A.bankName);
        A.bankName = "HDFC";
        // System.out.println(A.bankName);
        A.getBankName();
        System.out.println(A.bankName);
        System.out.println(a.x);// 90
        System.out.println(a1.x);// 90
        
        ////
        B c1 = new B();
        c1.a1.getBankName();
        c1.f1(a1);
        
        
        
        


    }
}
