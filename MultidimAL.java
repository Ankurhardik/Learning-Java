import java.util.ArrayList;
import java.util.Scanner;
public class MultidimAL {
    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> List= new ArrayList<>();
    //we cant directly make an input we must first declare arraylist inside it
    for(int i=0;i<3;i++){
        List.add(new ArrayList<>());
    } 
    Scanner in=new Scanner(System.in);
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            List.get(i).add(in.nextInt());
        }
    }
    System.out.println(List);
    }
}
