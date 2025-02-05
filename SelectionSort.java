import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={5,9,2,-3,3,6,0};
        System.out.println(Arrays.toString(SelectionSort(arr)));
    }
    static int[] SelectionSort(int[] arr){
        int k=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int max=0;
            int j=0;
            while(j<=k){
                if(arr[max]<arr[j]){
                    max=Math.max(max, j);
                }
                int temp=arr[k];
                arr[k]=arr[max];
                arr[max]=temp;
                j++;
            }
            k--;
        }
        return arr;
    }
}
