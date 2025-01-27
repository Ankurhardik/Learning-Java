import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> A =new ArrayList<>();//we can declare any no of inputs just like the vectors in c++
        ArrayList<Integer> Arr =new ArrayList<>();//little bit slower than array but so much useful
        A.add(45);
        A.add(145);
        A.add(435);
        A.add(405);
        A.add(945);
        System.out.println(A);
        A.remove(2);        
        System.out.println(A);
        Scanner in =new Scanner(System.in);
        for(int i=0;i<5;i++){
            Arr.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.print(Arr.get(i)+" ");//get command is used to get the index
        }
    }
}
