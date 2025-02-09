import java.util.Scanner;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("HCF="+Hcf(a,b));
        System.out.println("LCM="+Lcm(a,b));
    }
    static int Hcf(int a,int b){
        if(a==0){
            return b;
        }
        return Hcf(b%a,a);
    }
    static int Lcm(int a,int b){
        return (a*b)/Hcf(a,b);
    }
}
