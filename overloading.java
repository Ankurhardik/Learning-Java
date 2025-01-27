import java.util.Arrays;
public class overloading {
    public static void main(String[] args) {
        f(4);
        f(4,6);
        f("tony");
        demo("enma","ace");
        demo(3,7,87);
    }
    static void f(int a){
        System.out.println(a);
    }
    static void f(String name){
        System.out.println(name);
    }
    static void f(int a ,int b){
        System.out.println(a+b);
    }
    static void demo(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void demo(String ...b){
        System.out.println(Arrays.toString(b));
    }

}