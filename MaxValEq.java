import java.util.*;
public class MaxValEq {
    public static void main(String[] args) {
        int k=26;
        int[][] points={
            {-17,13},
            {2,1},
            {8,-5},
            {18,-20}
        };
        int ans=0;
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points.length;j++){
                if(i!=j){
                    int p=mod(points[i][0],points[j][0]);
                    if(p<=k){
                        ans=max(ans,(points[i][1]+points[j][1]+p));
                    }
                }
            }
        }
        System.out.println(ans);
    }
    static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    static int mod(int a,int b){
        if(a-b>=0){
            return a-b;
        }
        else{
            return b-a;
        }
    }
}
