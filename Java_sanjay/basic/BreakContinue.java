package basic;
/**
  Break ->  loop ko terminate  to break ka use kro
 */
public class BreakContinue {
    public static void main(String[] args) {
        // How break works 
        int[] arr1 = {19,34,56,3};
        for(int i = 0;i<arr1.length;i++){
            if(i == 1 || i == 3){
                System.out.println(arr1[i]);
                break;
            }
            System.out.println(arr1[i]);
        }
        System.out.println();

        /// found search number 
        int searchNummber = 12;
        boolean isNumberFound = false;
        int foundIndexNumber = -1;
        for(int i = 0;i<arr1.length;i++){
            if (arr1[i] == searchNummber) {
                // System.out.println(arr1[i] + " Number is found " + "at index " + i);
                foundIndexNumber = i;
                isNumberFound = true;
                break;
            }
        } // for loop closed

        if (isNumberFound == true) {
            System.out.println("Number is Found index at  " + foundIndexNumber +"th");
        }else{
            System.out.println("Number is not Found and index is " + foundIndexNumber + "th"); 
        }


    }
}
