import java.util.Scanner;

public class BSsqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pre=sc.nextInt();
        System.out.printf("%." + pre + "f",Sqrt(num,pre));
    }
    static double Sqrt(int a,int b){
        double s=0;
        double l=a/2;
        int i=1;
        double ans=0.00000000;
        while(s<l){
            double mid=s+(l-s)/2;
            if(mid*mid==a){
                ans=mid;
                break;
            }
            else if(mid*mid<a){
                ans=mid;
                s=mid;
            }
            else{
                l=mid-1;
            }
        }
        double inc=0.1;
        while(b>0){
            while(ans*ans<=a){
                ans+=inc;
            }
            ans-=inc;
            inc/=10;
            i++;
            b--;
        }
        return ans;
    }
}
