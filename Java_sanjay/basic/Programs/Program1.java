package basic.Programs;


public class Program1 {
    public static void main(String args[]) {
        int age = 25;
        int income = 45000;
        boolean isStudent = false;

        // if (age<18) {
        //   System.out.println("You are minor");
        // } 
        // if (18<age && age<65 && income<40000 && !isStudent) {
        //   System.out.println("you are an adult with high  income");
        // } else {
        //   System.out.println("you are an adult but student");
        // }
        if(age<18){
          System.out.println("You are minor");
        }
        else if(age >= 18 && age <= 65){
          if(income > 40000 && !isStudent){
            // it will run when it 's not student '
            System.out.println("you are an adult with high  income");
          }else if(isStudent){
            System.out.println("you are an adult but student");
          }else{
            System.out.println("You are an adult with a moderate income. ");
          }
        }else{
          System.out.println("You are a senior citizen.");

        }

    }
}
/* 
1. if age is blow 18 - print You are minor
2. if age is between 18 to 65  
  and income gretor than 40000 and also it is not student ->print you are an adult with high  income
  and income is not gretor than 400000 but it  is student  - . print you are an adult but student
  print You are an adult with a moderate income. 

3 You are a senior citizen.
*/