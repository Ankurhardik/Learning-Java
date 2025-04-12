public class RecursionProblems {
    public static void main(String[] args) {
        int a=253067;
        rev(a);
        System.out.println(sum);
    }
    static int sum=0;
    static void rev(int a) {
        if(a==0){
            return;
        }
        sum=10*sum+(a%10);
        rev(a/10);
    }
}
