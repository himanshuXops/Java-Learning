// type of inheritance 
// 1.single inheritance 
// 2. multilevel inheritance 

// multilevel 
class Vehicle{
   void start(){
    System.out.println("Vehicle Start ");
   }
}
class MotorCycle extends Vehicle{
   void diskBreak(){
      System.out.println("Motor Vehicle disk break ");
   }
}

class SportBike extends MotorCycle{
   String bikeName ;
   SportBike(String name){
      this.bikeName = name;
   }
   void addEngine(int eningeInCC){
      System.out.println("Sports Bike Engine in CC" + eningeInCC + " of " + bikeName);
   }
}

public class Program7 {
    public static void main(String[] args) {
      SportBike b1 = new SportBike("Hiyabuasa");
      b1.addEngine(1100);
    }
}
