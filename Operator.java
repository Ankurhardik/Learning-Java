import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+'b');
        //"+" is the only operator to print any datatype together and it is valid for string only so there must be a string in the print
        // System.out.println("a"-'b');   error
        System.out.println('a'+2);
        System.out.println((char)('a'+2));
        //cannot be done with any thing it must contain primitive datatype or string
        // System.out.println(5+ new Arraylist<>());    error
        System.out.println(5+""+new ArrayList<>());
        
    }
}
