import java.util.Arrays;

public class MergeSortinPlace {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        MS(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void MS(int arr[],int s,int l){
        if(l-s==1){
            return;
        }
        int mid=(l+s)/2;
        MS(arr, s, mid);
        MS(arr, mid,l);
        merge(arr,s,mid,l);
    }
    static void merge(int[] arr,int s,int m,int l){
        int ans[]=new int[l-s];
        int n=s,r=m,i=0;
        while(n<m && r<l){
            if(arr[n]<arr[r]){
                ans[i]=arr[n];
                n++;
            }
            else{
                ans[i]=arr[r];
                r++;
            }
            i++;
        }
        while(r<l){
            ans[i]=arr[r];
            i++;
            r++;
        }
        while(n<m){
            ans[i]=arr[n];
            i++;
            n++;
        }
        for(int p=0;p<ans.length;p++){
            arr[s+p]=ans[p];
        }
    }
}