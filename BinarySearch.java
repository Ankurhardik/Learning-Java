import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-13,-11,-9,-4,0,4,6,23,99,145};
        Scanner in =new Scanner(System.in);
        int tar=in.nextInt();
        System.out.println(BS(arr,tar));
    }
    static int BS(int[] arr,int tar){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[mid]<tar){
                s=mid;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}
