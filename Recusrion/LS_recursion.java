import java.util.ArrayList;
public class LS_recursion {
    public static void main(String[] args) {
        int arr[]={2,4,7,9,9,13,5,0};
        int tar=9;
        
        System.out.print(Ls(arr,tar,0));
        System.out.print(" at ");
        System.out.println(Lsi(arr,tar,0));
        Lsia1(arr,tar,0);
        System.out.println(L);
        System.out.println(Lsia2(arr,tar,0));
    }
    static boolean Ls(int arr[],int tar,int i){
        if(i==arr.length){
            return false;
        }
        return ((arr[i]==tar) || Ls(arr,tar,i+1));
    }
    static int Lsi(int arr[],int tar,int i){
        if(i==arr.length){
            return -1;
        }
        if(tar==arr[i]){
            return i;
        }
        else{
           return Lsi(arr,tar,i+1);
        }
    }
    static ArrayList<Integer> L =new ArrayList<>();
    static void Lsia1(int arr[],int tar,int i){
        if(i==arr.length){
            return;
        }
        if(tar==arr[i]){
            L.add(i);
            Lsia1(arr,tar,i+1);
        }
        else{
           Lsia1(arr,tar,i+1);
        }
    }
    //in this case list is defined inside the recursion function
    static ArrayList Lsia2(int arr[],int tar,int i){
        ArrayList<Integer> L2 =new ArrayList<>();
        if(i==arr.length){
            return L2;
        }
        if(tar==arr[i]){
            L2.add(i);
        }
        //LFB means all the indexes taken inside L2 after it
        ArrayList<Integer> LFB =Lsia2(arr,tar,i+1);
        L2.addAll(LFB);
        return L2;
    }
}
