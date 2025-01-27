import java.util.Arrays;
import java.util.Scanner;
public class MultidimArr {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];//its not necessary to show the no of columns
        int[][] arr1={
            {1,2,3},
            {5,7},
            {34,67,22,90,34}
        };
        int row=arr1.length;
        for(int i=0;i<row;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(arr1[2][3]);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[1].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(Arrays.toString(arr[i]));
            System.out.println();
        }
    }
}
