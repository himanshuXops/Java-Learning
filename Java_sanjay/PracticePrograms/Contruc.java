package PracticePrograms;

public class Contruc {
    int x = 2 ;
    int y = 3 ;
    int z = 5 ;

    String name ;
    float price;
    


    Contruc(){
        System.out.println("default constuctor");
    }
    
    Contruc(int x , int y ){
        this();
        this.x = x;
        this.y=  y ;

        System.out.println("parameter constructor x ="+x + "y="+ y );

    }

    Contruc(int x , int y ,int z ){
        this();
        this.x = x ;
        this.y = y ;
        this.z = z ;

        

        System.out.println("parameter constructor x ="+ x +  "y =" +y + "z=" +z);
    }


    Contruc mySR(){
        return this ;
    }


    Contruc (String name , float price , int x ){

        this.name = name ;
        this.price = price;
        this.x = x ;

        System.out.println( "parameter name= "+name + "price="+ price + "value ="+ x);


    }

}
