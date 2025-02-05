import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={1, 4, 3, 0, 2};
        System.out.println(Arrays.toString(CycleSort(arr)));
    }
    static int[] CycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=arr[arr[i]]){
                int temp=arr[i];
                arr[i]=arr[temp];
                arr[temp]=temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}