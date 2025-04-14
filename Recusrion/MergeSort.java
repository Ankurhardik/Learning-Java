import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println(Arrays.toString(MS(arr)));
    }
    static int[] MS(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=(arr.length)/2;
        int[] left=MS(Arrays.copyOfRange(arr, 0, mid));
        int[] right=MS(Arrays.copyOfRange(arr, mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] lt,int[] rt){
        int ans[]=new int[lt.length+rt.length];
        int l=0,r=0,i=0;
        while(l<lt.length && r<rt.length){
            if(lt[l]<rt[r]){
                ans[i]=lt[l];
                l++;
            }
            else{
                ans[i]=rt[r];
                r++;
            }
            i++;
        }
        while(r<rt.length){
            ans[i]=rt[r];
            i++;
            r++;
        }
        while(l<lt.length){
            ans[i]=lt[l];
            i++;
            l++;
        }
        return ans;
    }
}
//Merge sort is prefferd in linked list because its not a continous memory allocation it's a random memory allocation.