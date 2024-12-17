public class Program3 {
    public static void main(String[] args) {
        Example e1 = new Example(23);
        Example e2  = e1.myEx();
        System.out.println(e1); // Example@35047d03
        System.out.println(e2); // Example@35047d03
    }
}
