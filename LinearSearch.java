import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        String name="TonyStark";
        Scanner i=new Scanner(System.in);
        char target =i.next().charAt(0);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,target));  
    }
    static boolean search(String n, char t){
        if(n.length()==0){
            return false;
        }
        for(char ch:n.toCharArray()){
            if(ch==t){
                return true;
            }
        }
        return false;
    }
}