public class Sorted {
    public static void main(String[] args) {
        int arr[]={1,4,6,8,40};
        System.out.println(check(arr,0));

    }
    static boolean check(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        return (arr[i]<=arr[i+1]) && check(arr,i+1);
    }
}
