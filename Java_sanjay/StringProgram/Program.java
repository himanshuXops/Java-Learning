package StringProgram;

class Color{
    String color;
    Color(String color){
        this.color = color ;

    }
}
class FontFamily{
    String font;
    FontFamily(String font){
        this.font = font;
    }
}
class Button{
    String text;
    Color btnColor;
    FontFamily fontFm;
    Button(String text,Color clr, FontFamily fm){
        this.text = text ;
        this.btnColor = clr;
        this.fontFm = fm;
    }
    void display(){
        System.out.println(btnColor.color + fontFm.font + text);
    }
}
// class CustomLinearGradientButton extends Button{

// }
public class Program {
    public static void main(String[] args) {
        Button btn = new Button("Login ",
         new Color("Green"), 
        new FontFamily("Monsteraret"));
        btn.display();

        String str = "Himanshu ";
        System.out.println(str.charAt(0));
        System.out.println(charAt(str, 1));
        System.out.println(str.length());

        // substring
        //substring(int beginIndex) returns the substring starting from the given index.
        // substring(int beginIndex, int endIndex) returns the substring from beginIndex to endIndex - 1
        System.out.println(str.substring(7));
        System.out.println(str.substring(3,6));
        System.out.println(str.substring(7,9));


        System.out.println(str.toUpperCase());
        System.err.println(str.toLowerCase());
        System.err.println("   dsdsjd ".trim());

        String st1 = "Hello";
        String st2 = "Hello";
        String st3 = "hello";
        System.out.println(st1.hashCode());
        System.err.println(st2.hashCode());
        System.out.println(st1.equals(st2)); // true 
        System.out.println(st1.equals(st3)); // false 

        System.out.println("  HelloWorld ");



        
    }
    static char charAt(String str, int index){
        // str[0]
        char[] charArry = str.toCharArray();
        char ch=' ';
        if(index<0 || charArry.length <index){
            System.out.println("Index out out Bond");
            throw  new StringIndexOutOfBoundsException("Index out of Bond Exception at From Himanshu" + index);
        }
        for(int i = 0;i <charArry.length;i++){
            if(i == 0){
                ch =  charArry[0];
            }
        }
        return ch;
    }
}
