package basic;

//  Hello World My Name is Himanshu Chandra and My Age is 33. My hooby is Proven and Traders.

public class VariableBasic {
    public static void main(String[] args){
        int age = 33;
        String name = "Himanshu Chandra";
        String hobby = "Proven and Traders";
        String result = "Hello World My Name is " + name + "and My Age is " + age + "." + " My hooby is " + hobby + ".";
        System.out.println(result);

        // 
        // char ch = 'ceuiruieu';// takes only one character
        // char ch = "c";// wrong
        char ch = 'H';

        String st1 = "s";// right
        String st2 = "Multilpe chars ";

        int intMax = 2147483647;  // Maximum value for int
        long l1 = 2147483648L;
        long intOverflow = l1 + 1;  // This will overflow
        System.out.println(intMax);
        System.out.println(intOverflow);

        float f1 = 0.5f;
        double d = 0.4;
        float floatValue = 3.1415926535f;
        System.out.println(floatValue);


    }
}
