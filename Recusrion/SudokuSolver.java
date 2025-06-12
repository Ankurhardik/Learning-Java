public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solve(board)){
            display(board);
        }
        else{
            System.out.println("Invalid input");
        }
    }
    static boolean solve(int[][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyleft=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyleft=false;
                    break;
                }
            }
            if(emptyleft==false){
                break;
            }
        }
        if(emptyleft==true){
            return true;
        }
        for(int k=1;k<=n;k++){
            if(isSafe(board, row, col, k)){
                board[row][col]=k;
                if(solve(board)){
                    return true;
                }
                else{
                    board[row][col]=0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board,int row,int col,int nums){
        for(int i=0;i<board.length;i++){
            if(board[i][col]==nums || board[row][i]==nums){
                return false;
            }
        }
        int sqrt=(int)Math.sqrt(board.length);
        int sr=row-row%sqrt;
        int sc=col-col%sqrt;
        for(int i=0;i<3;i++){
            for(int k=0;k<3;k++){
                if(board[sr+i][sc+k]==nums){
                    return false;
                }
            }
        }
        return true;
    }
    static void display(int[][] board){
        for(int[] r:board){
            for(int num:r){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
