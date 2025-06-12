public class NQueens {
    public static void main(String[] args) {
        int n=5;
        boolean[][] check=new boolean[n][n];
        System.out.println(Queens(check, 0));

    }
    static int Queens(boolean[][] check,int row){
        if(row==check.length){
            display(check);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int c=0;c<check[0].length;c++){
            if(isSafe(check,row,c)){
                check[row][c]=true;
                count+=Queens(check, row+1);
                check[row][c]=false;
            }
        }
        return count;
    }
    private static void display(boolean[][] check){
        for(boolean[] k:check){
            for(boolean term:k){
                if(term){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
    private static boolean isSafe(boolean[][] check,int row,int c){
        for(int i=0;i<row;i++){
            if(check[i][c]){
                return false;
            }
        }
        int maxleft=Math.min(row, c);
        for(int i=1;i<=maxleft;i++){
            if(check[row-i][c-i]){
                return false;
            }
        }
        int maxright=Math.min(row, check.length-c-1);
        for(int i=1;i<=maxright;i++){
            if(check[row-i][c+i]){
                return false;
            }
        }
        return true;
    }
}
