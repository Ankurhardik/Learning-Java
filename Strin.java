import java.util.Arrays;

public class Strin {
    public static void main(String[] args) {
        //strings are immutable
        String name="Tom";
        System.out.println(name);
        String a="Java";
        String b="Java";
        String c=a;
        //every string points to the same object in string pool
        System.out.println(a==b);//true
        System.out.println(a==c);//true

        //for new string of same object
        String d=new String("Java");
        System.out.println(a==d);//false
        
        //just to check they have same value
        System.out.println(d.equals(a));//true

        System.out.println(Arrays.toString(name.toCharArray()));
        a.length();
        System.out.println(a.charAt(1));
    }
}
