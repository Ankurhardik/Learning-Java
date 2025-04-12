public class Rotated_BS {
    public static void main(String[] args) {
       int arr[]={5,6,7,8,9,1,2,3};
       int t=2;
       System.out.println(BS(arr,t,0,arr.length-1)); 
    }
    static int BS(int arr[],int t,int s,int l){
       int mid=s+(l-s)/2;
       if(s>l){
        return -1;
       }
       if(arr[mid]==t){
        return mid;
       }
       if(arr[s]<=arr[mid]){
        if(arr[0]<=t && t<=arr[mid]){
            return BS(arr,t,s,mid-1);
        }
        else{
            return BS(arr,t,mid+1,l);
        }
       }
       if(t>=arr[mid] && t<=arr[l]){
        return BS(arr,t,mid+1,l);
       }
       return BS(arr,t,s,mid-1);
    }
}
