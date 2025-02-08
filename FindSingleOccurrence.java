import java.util.*;
public class FindSingleOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,10,4,4,4};
        int[] check = new int[32];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int k = 31;
            while (num > 0) {
                check[k] +=num & 1 ;
                num>>=1;
                k--;
            }
        }
        int ans = 0;
        for (int i = 31; i >= 0; i--) {
            check[i] %= 3;
            ans += check[i] * Math.pow(2, (31 - i));
        }
        
        System.out.println((int)ans);
    }
}
