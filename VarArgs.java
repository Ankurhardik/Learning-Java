import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(4,"boomb",3,7,6,98);
    }
    //static void fun(int b,int ...a,int b) this will give an error as varriable argument must be at end
    static void fun(int b,String anme,int ...a){
        System.out.println(Arrays.toString(a));
    }
}
