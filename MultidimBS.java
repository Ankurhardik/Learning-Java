import java.util.Arrays;
import java.util.Scanner;
public class MultidimBS {
    public static void main(String[] args) {
        int[][] arr= {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        Scanner sc=new Scanner(System.in);
        int tar=sc.nextInt();
        System.out.println(Arrays.toString(BS(arr,tar)));
    }
    static int[] BS(int[][] arr,int tar){
        int r=0;
        int c=arr[0].length-1;
        while(c>=0 &&r<arr.length){
            if(arr[r][c]==tar){
                return new int[]{r, c};
            }
            else if(arr[r][c]<tar){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }   
}