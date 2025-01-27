import java.util.Arrays;
import java.util.Scanner;
public class ArrayDec {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr=new int[5];
        int [] arr1={1,3,6,78,95,2};
        System.out.println(arr1[3]);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // for(int num:arr){
        //     System.out.println(num); //this is advanced for loop
        // }
        System.out.println(Arrays.toString(arr));
    }
}