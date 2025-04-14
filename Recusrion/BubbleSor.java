import java.util.Arrays;
public class BubbleSor {
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        Bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int arr[],int l,int s){
        if(l==0){
            return;
        }
        if(l>s){
            if(arr[s]>arr[s+1]){
                int temp=arr[s];
                arr[s]=arr[s+1];
                arr[s+1]=temp;
            }
            Bubble(arr,l,s+1);
        }
        else{
            Bubble(arr,l-1,0);
        }
    }
}
