import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={-1,7,-79,0,43};
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }
    static int[] BubbleSort(int[] arr){
        int k=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int j=0;
            boolean swap=false;
            while(j<=k && j+1<=k){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
                j++;
            }
            if(!swap){
                break;
            }
            k--;
        }
        return arr;
    }
}
