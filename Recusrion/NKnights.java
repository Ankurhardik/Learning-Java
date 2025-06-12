public class NKnights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] check =new boolean[n][n];
        Knights(check,0,0,n);
    }
    private static void Knights(boolean[][] check,int row,int col,int k){
        if(k==0){
            display(check);
            System.out.println();
            return;
        }
        if (row == check.length) {
            return;
        }
        if(col==check.length){
            row++;
            col=0;
            if (row == check.length) return;
        }
        if(isSafe(check,row,col)){
            check[row][col]=true;
            Knights(check, row, col+1, k-1);
            check[row][col]=false;
        }
        Knights(check, row, col+1, k);
    }
    private static void display(boolean[][] check){
        for(boolean[] k:check){
            for(boolean term:k){
                if(term){
                    System.out.print("K");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
    private static boolean isSafe(boolean[][] check,int row,int col){
        if(row-2>=0 && col-1>=0 && check[row-2][col-1]==true ) {
            return false;
        }
        if(row-2>=0 && col+1<check.length && check[row-2][col+1]==true){
            return false;
        }
        if(row-1>=0 && col-2>=0 && check[row-1][col-2]==true ){
            return false;
        }
        if(row-1>=0 && col+2<check.length && check[row-1][col+2]==true  ){
            return false;
        }
        return true;

    }
}
