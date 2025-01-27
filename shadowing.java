public class shadowing {
    static int x=10;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        //System.out.println(x); this will give an error as x is just declared not initialised
        x=40;//this x shadows the upper x
        System.out.println(x);
        f();
    }
    static void f(){
        System.out.println(x);
    }
}
