package array;
/**
  find max element
 */
public class Program2 {
    public static void main(String[] args) {
        int[] arr = {1100,34,55,67,12};
        int maxValue = arr[0];
        int minValue = arr[0];
        for(int i = 1 ; i <arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
            if (arr[i]<minValue) {
                minValue = arr[i];
            }
        }
        System.out.println(maxValue);
        System.out.println(minValue);

    }   

}
