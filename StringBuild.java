public class StringBuild {
    public static void main(String[] args) {
        StringBuilder S=new StringBuilder();
        //this is muttable
        char ch='a';
        for(int i=0;i<26;i++){
            S.append(ch);
            ch=(char)(ch+1);
        }
        System.out.println(S);
        S.deleteCharAt(1);
        System.out.println(S);
        S.reverse();
        System.out.println(S);
    }
}
