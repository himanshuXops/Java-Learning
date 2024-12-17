package basic;


// demo of operator 
public class Example1 {
    public static void main(String[] args) {
        int age = 35;
        double income = 60000;
        boolean hasCriminalRecord = false;
        int membershipYears = 3;

        // Complex condition using && operator
        if ((age >= 18 && age <= 60) && 
            (income > 50000) && 
            (!hasCriminalRecord) && 
            (membershipYears > 2)) {

            System.out.println("Person is eligible for the special membership.");
        } else {
            System.out.println("Person is NOT eligible for the special membership.");
        }
 
    }
}
