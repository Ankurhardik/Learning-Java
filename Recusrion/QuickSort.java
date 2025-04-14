import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        QS(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void QS(int[] arr,int l,int h){
        if(l>=h){
            return;
        }
        int s=l,e=h;
        int mid=(s+e)/2;
        int p=arr[mid];
        while(s<=e){
            while(arr[s]<p){
                s++;
            }
            while(arr[e]>p){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        QS(arr,l,e);
        QS(arr,s,h);
    }
}
