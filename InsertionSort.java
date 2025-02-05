import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={-1, 7, -79, 0, 43};
        System.out.println(Arrays.toString(InsertionSort(arr)));
    }
    static int[] InsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
                j--;
            }
        }
        return arr;
    }
}
