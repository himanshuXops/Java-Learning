package basic;

public class Operator_Basic {
    public static void main(String[] args) {

        int x = 34;
        int y = 90;
        // 1. Arithmetic Operators
        // +,  - , ++, -- ,* , / ,%
        int  result = x + y ;
        // int inc = ++x; // pre 
        // System.out.println(inc);//35
        // System.out.println(x);//35
        int inc2 = x++;
        System.out.println(inc2);
        System.out.println(x);

        int result1 = 90 * 90;
        float div = 10/3f;
        System.out.println(div);

        int reminder = 11%2; // gives reminder
        System.out.println(reminder);

        System.out.println(0%5);//0
        System.out.println(10/5);//
        System.out.println(10/0.5);//



        // && (and )  -> both condition should be true
        //  || or

        boolean isMeeshoDeveloper = true;
        boolean isPgDeveloperHH = false;

        if(isMeeshoDeveloper && isPgDeveloperHH ){
            System.out.println("HH EnterPrises");//
        }else{
            System.out.println("Meesho Ka Emplyeeoes nhi h block this Employee ");//
        }

        if(isMeeshoDeveloper || isPgDeveloperHH ){
            System.out.println("HH EnterPrises ka malik");//
        }else{
            System.out.println("Meesho Ka Emplyeeoes nhi h block this Employee ");//
        }


 
        boolean isUserLoggedIn = true;
        boolean isUserOnHomeScreen = true;

   
        System.out.println(isUserLoggedIn && isUserOnHomeScreen ); // true 

        if(isUserLoggedIn && isUserOnHomeScreen ){
            System.out.println("Welcome HH EnterPrises Dashboard ");//
        }else{
            System.out.println("Login Screen ");//
        }

        // ! not operator  if value is true 

               // <=   =>
        // ==
        System.out.println(2 == 2);
        System.out.println(2.0 == 2);
        // System.out.println("2.0" == 2);  // can't match int with string
        System.out.println('c' == 100); // false
        System.out.println('d' == 100); // true




        // ternary operator ?:
        String isCompanyName = (isMeeshoDeveloper && isPgDeveloperHH)? "HH Enterprises" : "Not Meesho Developer";

        if(isMeeshoDeveloper){

        }else{

        }





        // convert character to Ascii code 
        char ch = 'd';
        int asciiValue = (int) ch;  // Cast the character to its ASCII value
        float asciiValue2 = (float) ch;  // Cast the character to its ASCII value

        System.out.println("The ASCII value of 'd' is: " + asciiValue);



                // !=	Not equal to

         System.out.println(3!=3);

//          +=	Add and assign	a += b
// -=	Subtract and assign	a -= b
// *=	Multiply and assign	a *= b
// /=	Divide and assign	a /= b
// %=	Modulus and assign	a %= b

        
        int a = 9;
        int b = 9;
         a = a + b;
         System.out.println("a = " + a);
         a +=b; // a = a + b 
         System.out.println("a = " + a);
         a -=b; // a = a - b
         System.out.println("a = " + a);
         a *=b; // a = a * b
         System.out.println("a = " + a);
         a /=b; // a = a / b
         System.out.println("a = " + a);
         a %=b; // a = a%b
         System.out.println("a = " + a);



    }
}
