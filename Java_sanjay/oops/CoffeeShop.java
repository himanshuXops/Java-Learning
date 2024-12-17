public class CoffeeShop {

    float price ;
    String coffeeName;
    int qty;


    void displayCoffeeDetails(){  
        System.out.println("price: " + price);
        System.out.println("coffeeName: " + coffeeName);
        System.out.println("Quantity: " + qty);
    }
    // constructor create
    CoffeeShop(){
        System.out.println("default constructor");
    }
    CoffeeShop(int x){
        System.out.println("paramter constructor");
    } 

    /* 
    not constructor 
    CoffeeShop1(){
        System.out.println("default constructor");
    }
        */


    // String Flavor ;
    // public static void main(String[] args) {
    //     CoffeeShop capacino = new CoffeeShop();
    // }
}
