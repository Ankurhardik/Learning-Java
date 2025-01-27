public class armstrong {
    public static void main(String[] args) {
        int a=100;
        int b=999;
        while(a<=b){
            int o=a;
            int i=0,sum=0;
            while(o>0){
            i=o%10;
            sum=i*i*i+sum;
            o=o/10;
            }
            if(sum==a){
                System.out.println(a);
            }
            a++;
        }
    }
}
