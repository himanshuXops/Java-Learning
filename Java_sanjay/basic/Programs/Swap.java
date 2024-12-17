package basic.Programs;

public class Swap {
    public static void main(String[] args) {
        //  using third number  
        int a = 10;
        int b = 20;
        int c = 0;
        c = b;  
        b = a;
        a = c;

        System.out.println("value a = " + a + " value b = " + b);


        // without using third number  
        int x = 12;
        int y = 89;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("value x = " + x + " value y = " + y);


    }
}
