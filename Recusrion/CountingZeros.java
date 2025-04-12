import java.util.Scanner;

public class CountingZeros {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        Cz(n);
        System.out.println(count);
    }
    static int count;
    static void Cz(int a){
        if(a==0){
            return;
        }
        int i=0;
        i=a%10;
        if(i==0){
            count++;
        }
        Cz(a/10);
    }
}
