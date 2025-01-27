import java.util.Scanner;
public class checkprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean ans=isprime(a);
        System.out.println(ans);
    }
    static boolean isprime(int a){
        if(a<2){
            return false;
        }
        int c=2;
        while(c*c <a){
            if(a%c ==0){
                return false;
            }
            c++;
        }
        return c*c >a;
    }
}
