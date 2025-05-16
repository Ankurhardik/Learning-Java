public class Maze1 {
    public static void main(String[] args) {
        int k = countWays(0, 0);
        System.out.println("Total paths: " + k);
        path("",0,0);
    }

    static int countWays(int x, int y) {
        if (x == 2 || y == 2) {
            return 1;
        }
        
        int paths = 0;
        if(x<2 && y<2){
            paths+=countWays(x+1, y+1);
        }
        
        if (x < 2) {
            paths += countWays(x + 1, y);
        }
        
        if (y < 2) {
            paths += countWays(x, y + 1);
        }
        
        return paths;
    }
    static void path(String p,int r,int c){
        if (r == 2 && c == 2){
            System.out.println(p);
            return ;
        }
        if(r<2){
            path(p+'H',r+1,c);
        }
        if(c<2){
            path(p+'V',r,c+1);
        }
        if(r<2 && c<2){
            path(p+'D',r+1,c+1);
        }

        return;
    }
}