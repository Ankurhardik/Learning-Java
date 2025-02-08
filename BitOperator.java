import java.util.Scanner;

public class BitOperator {
    public static void main(String[] args) {
        // &=and
        // ^=xor
        // <<=left shift
        // >>=right shift
        
        //find even or odd
        int n=4;
        if((n & 1)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }

        // //double a no.
        int k=3;
        int K=3<<1;
        System.out.println(K);

        //find unique
        int[] arr={1,3,45,7,3,1,45};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        System.out.println(ans);

        //find ith bit
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int p=35;
        ans=(35 & (1<<(i-1)));
        System.out.println(ans);

        //check if a no. is pow of 2
        int z=256;
        if((z & z-1)==0){
            System.out.println("true");
        }
        else
        System.out.println("false");

        //power
        int base=8;
        int pow=8;
        ans=1;
        while(pow>0){
            if((pow & 1)==1){
                ans*=base;
            }
            base*=base;
            pow>>=1;
        }
        System.out.println(ans);
    }
}
 