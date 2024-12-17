package basic;
import java.util.Scanner;
 
public class UserInput2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        String[] arr1 = new String[5];
        Scanner  obj = new Scanner(System.in);

        int size;
        System.err.println("Enter a size of array");
        size = obj.nextInt();

        obj.nextLine(); //  scan doesn't move automatically 

        String[] arr2 = new String[size];

        for(int  i = 0;i<arr2.length;i++){
            System.out.println("Enter a name at " + (i + 1) );
            // arr[i] = obj.nextInt();
            arr2[i] = obj.nextLine();
            // obj.next

        }

        System.out.println("Result ");

        for(int i = 0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
