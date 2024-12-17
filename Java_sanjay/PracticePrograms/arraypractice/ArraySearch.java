public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {0,11,10,0,6,5,4};
        
         int x = 12;
        for (int i =0 ; i < arr.length; i++){
            if(arr[i]==x){
            System.out.println(arr[i]);
            }else{
                System.out.println("value not found");
            }
        }
    

    }
}
