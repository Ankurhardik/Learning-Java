public class KadaneAlgo {
    public static void main(String[] args) {
        //this algo is for finding maximum sum form subarray
        //but only when explicitly told to return 0 when maximum sum is -ve
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int max=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        // for (int i = 1; i < nums.length; i++) {
        //     sum = Math.max(nums[i], sum + nums[i]); // Extend or restart sum
        //     max = Math.max(max, sum); // Update global maximum
        // }
        //this is for when we want -ve also
        System.out.println(max);
    }
}
