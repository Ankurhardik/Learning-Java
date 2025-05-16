import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        int t=in.nextInt();
        int k=0;
        for(int i=0;i<s.length();i++){
            int n=(int)(s.charAt(i)-'a');
            n++;
            System.out.println(n);
            if((n+t)<=26){
                k++;
            }
            else if((n+t)>26){
                k=k+2;
            }
            System.out.println(k);
        }
        System.out.println(k);
    }
}
