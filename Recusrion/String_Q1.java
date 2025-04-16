public class String_Q1 {
    public static void main(String[] args) {
        String str="baccad";
        StringBuilder s=new StringBuilder();
        RAa(str,s,0);
        System.out.println(s);
        skip("","kamskakdmaw");
    }
    static void RAa(String str,StringBuilder s,int i){
        if(i>str.length()-1){
            return;
        }
        else if (str.charAt(i)!='a') {
            s.append(str.charAt(i));
        }
        RAa(str, s, i+1);
    }
    static void skip(String r,String s){
        if(s.isEmpty()){
            System.out.println(r);
            return;
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            skip(r,s.substring(1));
        }
        else{
            skip(r+ch,s.substring(1));
        }
    }
}
