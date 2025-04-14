import java.util.Arrays;
public class SelectionSor {
    public static void main(String[] args) {
        int arr[]={3,7,5,1,9};
        SelSor(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void SelSor(int arr[],int l,int s,int i){
        if(l==0){
            return;
        }
        if(l>s){
            if(arr[s]>arr[s+1]){
                i=s;
            }
            else{
                i=s+1;
            }
            SelSor(arr,l,++s,i);
        }
        else{
            int temp=arr[i];
            arr[i]=arr[l];
            arr[l]=temp;
            SelSor(arr,--l,0,0);
        }
    }
}
