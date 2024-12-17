package arraypractice;

public class ArraySum {

    public static void main(String[] args) {

        int n = 0;

        int [] myarray={190,13,16,78,90};
        for(int i = 0 ; i <myarray.length; i++){
            n = n +myarray[i]; 
        }
        System.out.println("total sum "+ n );
    }
}