public class scope {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        {
            a=40;
            int c=30;
        }
        System.out.println(a+" "+b);
        //System.out.println(c); it will give error as c is initialised inside the block
        //but a will be changed a its pre initialised 
        
        for(int i=0;i<3;i++){
            //for loop is also like a scope int i wont work oustside of the for loop
        }
    }
}
