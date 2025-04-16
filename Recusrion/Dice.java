public class Dice {
    public static void main(String[] args) {
        D("",4);
        DF("",9,8);
    }
    static void D(String p,int tar){
        if(tar==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=tar;i++){
            D(p+i,tar-i);
        }
    }
    //if we change the no. of faces of the dice 
    static void DF(String p,int tar,int f){
        if(tar==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=f && i<=tar;i++){
            DF(p+i,tar-i,f);
        }
    }
}
