package PracticePrograms.arraypractice;

public class Array3 {
    public static void main(String[] args) {
        int[] MyArray1 = {12,11,10,7,6,5};
        int[] MyArray2 = {12,15,16,18,19};



        int[] ThirdArray = new int [MyArray1.length + MyArray2.length];
        


        for (int i = 0 ; i<MyArray1.length; i++) {
            ThirdArray[i]=MyArray1[i];
        }

          for  (int i= 0 ; i<MyArray2.length; i++ ){
            ThirdArray[MyArray1.length+i]= MyArray2[i];
         }

            System.out.println("Third Array elements:");
            for (int i = 0; i < ThirdArray.length; i++) {
                System.out.print(ThirdArray[i]);
        }






    }
}
