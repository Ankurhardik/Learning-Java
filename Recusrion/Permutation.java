public class Permutation {
    public static void main(String[] args) {
        Per("","abc");
    }
    static void Per(String p,String r){
        if(r.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=r.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String b=p.substring(i,p.length());
            Per((f+ch+b),r.substring(1));
        }
    }
}
