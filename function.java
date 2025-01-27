import java.util.Arrays;

public class function {
    public static void main(String[] args) {
        // in java there is only pass by value there is no pass by reference
        int a = 10;
        int[] arr = {1, 2, 3, 4, 5};
        ch(a);
        cha(arr);
        System.out.println(a);            // Output: 10
        System.out.println(Arrays.toString(arr));  
        // Output: [55, 2, 3, 4, 5] as cha is changing the value of the array's oth place object thats why its changed
    }

    static void ch(int a) {
        a = a - 5;
    }

    static void cha(int[] a) {
        a[0] = 55;
    }
}
