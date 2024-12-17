package basic;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        while(condition){
            // code of block executes
        }
        */
        int i = 10;
        int runtimeValue = 5;
        while (i>runtimeValue) {
            System.out.println(i);
            i--;
        }
        System.out.println("loop Completed");

        int[] arr = {10,5,67,34};
        int index = 0;
        while(index<arr.length){
            System.out.println(arr[index]);
            index++;
        }
        System.out.println();
// =======================================================================================
        int[] array1 = {12,34,45,67};
        int index1  = 0;
        int sum  = 0; 
        while (index1<array1.length) {
           sum  = sum + array1[index1]; 
           index1 ++;
        }
        System.out.println("Sum of program " + sum );


        int [] array2 = {1,2,3,4};
        int index3=0;
        while (index3<array2.length) {
            System.out.println(array2[index3]);
            index3++;  
        }
        

    }
}
