package Backtracking;

public class NQueens{
    static int n = 3;
    static char[][] board = new char[n][n];
    static boolean found = false;
    static {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
    }

    static boolean isFill(int row,int col){
        int dupRow = row;
        int dupCol = col;

        // for upper diagonal
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = dupRow;
        col = dupCol;

        // checking left row
        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col--;
        }

        row = dupRow;
        col = dupCol;

        // checking for lower diagonal

        while(row < n && col >= 0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }

        return true;
    }


    static void solve(int col){
        if(col == n){
            found = true;
            // for(char[] r:board){
            //     System.out.println(new String(r));
            // }

            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int row = 0;row<n;row++){
            if(isFill(row,col)){
                board[row][col] = 'Q';
                solve(col + 1);
                board[row][col] = '.';
            }
        }
    }


    public static void main(String[] args) {
        solve(0);
        if(!found) {
            System.out.println("No solution");
        }
    }
}