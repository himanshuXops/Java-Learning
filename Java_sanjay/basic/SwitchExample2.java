package basic;

public class SwitchExample2 {

    public static void main(String[] args) {
        int x = 90;
        int  y = 23;
        char ch = '2';
        int result = 90;
        switch (ch) {
            case '+':
                result = x + y;
                break;
            case  '-':
                result = x - y;
                break;
            case '*':
                result = x * y / 2;        
                break;
            case '/':
                result = x * y /2;
                break;    
            default:
                System.out.println("No calculation is here");
                break;

        }
        System.out.println("result " + result);
    }
}