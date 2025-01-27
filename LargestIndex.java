import java.util.Arrays;
public class LargestIndex {
    public static void main(String[] args) {
        int[] arr={23,134,56,287,9};
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]>arr[j]){
                j++;
            }
            else{
                i=j;
                j++;
            }
        }
        System.out.println(i);
    }
}
