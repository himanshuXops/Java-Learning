package array;

//
//  array is a data structure used to store multiple elements of the same type in a single variable.
//  Arrays in Java are fixed in size, 
//  Arrays are zero-indexed (i.e., the first element is at index 0).
public class Program1 {
    public static void main(String[] args) {
        //1.  Declaring an array without initializing: , it must be initialized 
        int[] myarray; // declare 
        myarray = new int[5]; //and initizalize yha create hoga array block
        // start 0 index to 4
        //assign value 
        myarray[0] = 90;
        myarray[1] = 91;
        myarray[2] = 12;
        myarray[3] = 12;
        myarray[4] = 1;
        // myarray[5] = 12; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        for(int i = 0;i<
        myarray.length;i++){
            System.out.println(myarray[i]);
        }
        /**
         *2. yha array declare in initialize sath me ho rha h
         */
        float[] myarray1 = new float[5];
        myarray1[0] = 23.5f;
        System.out.println(myarray1[0]);// 0.0


        String[] myarray2 = new String[5];
        System.out.println(myarray2[0]); // null 

        char[] myarray3 = new char[5];
        System.out.println(myarray3[0]); // empty string

        int[] myarray4 = new int[5];
        System.out.println(myarray4[0]);// 0
        // 3. Declaring, initializing, and assigning values:
        // myarray4 = {10, 20, 30, 40, 50};  
        int[] myarray5 = {10, 20, 30, 40, 50}; 
        for(int i = 0;i<myarray5.length;i++){
            System.out.println(myarray5[i]);
        } 

        // multidimension array         
        // 10 50 21 45 67 12 89
        // usko reverse me print me krna condition even 
        
        




    }
}
