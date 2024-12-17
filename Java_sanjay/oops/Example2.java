public class Example2 {

    
    int x = 3;
    
    Example2(){
        //Default construtor 
        System.out.println("Default x = " +x );
    }
    Example2(int x){
        //Default construtor 
        this(x,34);
        System.out.println("Default x = " +x );
    }
    Example2(int x, int y ){
        //Default construtor 
        this.x = x;
        // this(); /error 
        System.out.println("");
    }
    Example returnObj(int x){
        this.x  = x;
        Example e1 = new Example();
        return e1;
    }
    Example2 returnCurrentObject(){
        return this;
    }


    {
        // this is initializer block 
        // jab bhi object bnega sbse pahle ye  run hoga 
        // constructor se bhi phle ye call hoga
        System.out.println("Inittializer block x = "+ x);
    }


    static {
        System.out.println("Static block");
    }
}

