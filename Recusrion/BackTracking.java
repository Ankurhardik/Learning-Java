import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path=new int[3][3];
        //AllPaths("", board, 0, 0);
        AllPathsPrint("", board, 0, 0, path, 1);

    }
    static void AllPaths(String p, boolean[][] b, int r, int c) {
        if (r == 2 && c == 2) {
            System.out.println(p);
            return;
        }
        if (!b[r][c]) {
            return;
        }
        //this is where we made the change 
        b[r][c] = false;

        if (r < 2) {
            AllPaths(p + "D", b, r + 1, c);
        }
        if (c < 2) {
            AllPaths(p + "R", b, r, c + 1);
        }
        if (r > 0) {
            AllPaths(p + "U", b, r - 1, c);
        }
        if (c > 0) {
            AllPaths(p + "L", b, r, c - 1);
        }
        //this is where my recursive call gets over
        //now we have to remove the changes made during the recursion
        b[r][c] = true;//this is backtracking
    }
    static void AllPathsPrint(String p, boolean[][] b, int r, int c,int[][] path,int step) {
        if (r == 2 && c == 2) {
            path[r][c]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            
        System.out.println(p);
        System.out.println();
            return;
        }
        if (!b[r][c]) {
            return;
        }
        path[r][c]=step;
        b[r][c] = false;

        if (r < 2) {
            AllPathsPrint(p+"D", b, r+1, c, path, step+1);
        }
        if (c < 2) {
            AllPathsPrint(p + "R", b, r, c + 1, path, step+1);
        }
        if (r > 0) {
            AllPathsPrint(p + "U", b, r - 1, c, path, step+1);
        }
        if (c > 0) {
            AllPathsPrint(p + "L", b, r, c - 1, path, step+1);
        }
        b[r][c] = true;
        path[r][c]=0;
    }
}
