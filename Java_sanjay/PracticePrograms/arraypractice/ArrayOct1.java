package arraypractice;

public class ArrayOct1 {

    public static void main(String[] args) {
        // int[]  myarray;
    // myarray1= new int [5];

    // myarray[0]= 10;
    // myarray[1]= 50;
    // myarray[2]= 21;
    // myarray[3]= 45;
    // myarray[4]= 67;
    // myarray[5]= 12;
    // myarray[6]= 89;

    int[] myarray1={10,20,30,40,50};

    for (int i=0 ; i <=myarray1.length; i++){
        if (i%2!=0) {
            
            System.out.println("even"+' '+  myarray1[i]);
        } else {
            System.out.println("odd"+ ' '+ myarray1[i]);
        }
    }
        
    }
    



    


}
