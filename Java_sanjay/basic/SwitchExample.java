package basic;

// a switch statement is used to execute one block of code from multiple 
// options based on the value of an expression.
public class SwitchExample {
    public static void main(String[] args) {
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("Print 1");
                break;
            case 2:
                System.out.println("Print 2"); 
                break;
         case 3:
                System.out.println("Print 3");   
                break;    
          default:
                System.out.println("Nothing Match");       
                break;
        }
    }
}




