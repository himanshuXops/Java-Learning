package array;

public class Program3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 13;
        arr[2] = 15;
        arr[3] = 16;  
        // sbse last item ki value pr second last item ki value ko asssign kro
        for(int i = arr.length;i>0;i--){
            if(i == 1){
                arr[1] = 35;
                break;
            }else{
                arr[i-1] = arr[i-2];
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
