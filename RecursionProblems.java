public class RecursionProblems {
    public static void main(String[] args) {
        int a=253067;
        SOD(a);
        System.out.println(sum);
    }
    static int sum=0;
    static void SOD(int a) {
        if(a==0){
            return;
        }
        sum=10*sum+(a%10);
        SOD(a/10);
    }
}
