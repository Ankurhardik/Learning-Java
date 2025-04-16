import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_Q2 {
    public static void main(String[] args) {
        subset("","abc");
        System.out.println(subseq("","abc"));
        subseqAscii("","abc");
        int[] arr={2,4,5};
        int[] arr2={1,2,2};
        System.out.println(Sub(arr));
        System.out.println(Subdup(arr2));
    }
    static void subset(String p,String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        subset(p+s.charAt(0),s.substring(1));
        subset(p,s.substring(1));
    }
    static ArrayList<String> subseq(String p,String s ){
        if(s.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left=subseq(p+s.charAt(0),s.substring(1));
        ArrayList<String> right=subseq(p,s.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseqAscii(String p, String s) {
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);
        subseqAscii(p + ch, s.substring(1));
        subseqAscii(p, s.substring(1));
        subseqAscii(p + (ch + 0), s.substring(1));
    }
    //without recursion
    static List<List<Integer>> Sub(int[] arr) {
        List<List<Integer>> a=new ArrayList<>();
        a.add(new ArrayList<>());
        for(int num:arr){
            int n=a.size();
            for(int i=0;i<n;i++){
                List<Integer> b=new ArrayList<>(a.get(i));
                b.add(num);
                a.add(b);
            }
        }
        return a;
    }
    static List<List<Integer>> Subdup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> a=new ArrayList<>();
        a.add(new ArrayList<>());
        int start=0,end=0;
        for(int k=0;k<arr.length;k++){
            start=0;
            if(k>0 && arr[k]==arr[k-1]){
                start=end+1;
            }
            end=a.size()-1;
            int n=a.size();
            for(int i=start;i<n;i++){
                List<Integer> b=new ArrayList<>(a.get(i));
                b.add(arr[k]);
                a.add(b);
            }
        }
        return a;
    }
}
