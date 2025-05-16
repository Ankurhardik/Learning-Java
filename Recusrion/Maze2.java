public class Maze2 {
    public static void main(String[] args) {
        boolean[][] b1={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        pathres("",b1,0,0);

    }
    static void pathres(String p,boolean[][] b,int r,int c){
        if (r == 2 && c == 2){
            System.out.println(p);
            return ;
        }
        if(!b[r][c]){
            return;
        }
        if(r<2){
            pathres(p+'H',b,r+1,c);
        }
        if(c<2){
            pathres(p+'V',b,r,c+1);
        }
        if(r<2 && c<2){
            pathres(p+'D',b,r+1,c+1);
        }

        return;
    }
}
