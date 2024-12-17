// inheritance 
// 2 class ke bech relationship h
// ek class chahti h dusri class ki property ko inherit/ extend/ resue  krna chahti h 
// dusri class k property and functionality ko so we can use inheritance

// superclass/Base class /Parent class - agr dusri classs isko extend kre 
// subclass/child -> agr ye dusri class ko extend kre
// using extends keyword you can inherit 
// code reuse 
//single inheritance - 

// Method Overriding 
// parent class me koi function that ab us function ki me new functionlity dena chahti hu child class me
// to me use kruga overiding ka 
// function ka name agr same h to override kr skte ho or 
class Car {

    String color="green";
    
    // Car(String color ){
    //     this.color = color;
    // }
    void getEngineDetails(){
        System.out.println("old Engine Details");
    }
    void start(){
        System.out.println("old Engine takes 2 minute to start");
    }

}
class SportsCar extends Car{
    void start(){
        System.out.println("new Engine takes imeediate to start");
    }
    void getEngineDetails(){
        System.out.println("new Engine Details");

    }

    void addAbsFeature(){
        System.out.println("addAbsFeature SoprtsCar");
    }
    void getSuperEngineDetails(){
        System.out.println("super Engine SoprtsCar");

    }
     

}



public class Program6 {

    public static void main(String[] args) {
        // Car maruti = new Car("White");
        Car ambessdar = new Car();
        ambessdar.getEngineDetails();
        ambessdar.start();

        SportsCar astinMartin = new SportsCar();
        astinMartin.getEngineDetails();
        System.out.println(astinMartin.color);
        astinMartin.start();

        astinMartin.addAbsFeature();
        // ambessdar.addAbsFeature();// not possible 


    }
}