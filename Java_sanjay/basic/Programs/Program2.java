package basic.Programs;

public class Program2 {
    public static void main(String[] args) {
        // print Ascii code 
        // 0 to 127
        int x = 65; // Ascii Code of A
        char c1 = (char) x;
        int c2 = (char) c1;

        System.out.println(c1); // A
        System.out.println(c2); // 65


        for(int i = 0; i <= 127;i++){
            char charConversion = (char) i;
            System.err.println(charConversion);
        }
        
        
    }
}

/*

 */