package basic;


/**
 while - first condition check then execute 
 do While -> first excute and after condition check, at least it will run code of block once if condition false or true 
 continue -> skip the the exeeution and move to the next iteration
 break -> To stop execution in  the loop 
  
 */
public class DoWhile {
    public static void main(String[] args) {
        
        /* 
        for(int i = 0; i < arr1.length;i++){
            System.out.println(arr1[i]);
        }

        int i = 0;
        while (i<arr1.length) {
            System.out.println(arr1[i]);
            i++;
        } */


        int x = 10;
        int[] arr1 = {12,34,56,23};

        int i = 0;
        do {
            System.out.println(arr1[i]);
            i++;
            if (i == 1) {
                continue;
            }
            System.out.println("Hello1");
        } while (i<arr1.length);
        System.out.println("Do while complete");


        // int[] arr1 = {12,34,56,23};

        for(int z = 0;z<arr1.length;z++){
            if(z == 2){
                continue;
            }
            if(z == 3){
                continue;
            }
            System.out.println(arr1[z]);

        }


    }
}
