package Backtracking;

import java.util.Arrays;

public class NQueensOptimal {

    static int n = 4;
    static char[][] board = new char[n][n];
    static int[] leftRow = new int[n];
    static int[] upperDiagonal = new int[2 * (n-1)];
    static int[] lowerDiagonal = new int[2 * (n-1)];

    static {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        Arrays.fill(leftRow, 0);
        Arrays.fill(upperDiagonal, 0);
        Arrays.fill(lowerDiagonal, 0);


    }

    static void solve(int col){
        if(col == n){
            for(char[] r : board){
                System.out.println(new String(r));
            }
            System.out.println();
            return;
        }

        for(int row = 0;row < n;row++){
            if(leftRow[row] == 0 && lowerDiagonal[row + col] == 0 
                && upperDiagonal[n-1 + (col - row)] == 0){
                    board[row][col] = 'Q';
                    leftRow[row] = 1;
                    lowerDiagonal[row+col] = 1;
                    upperDiagonal[(n-1) + (col - row)] = 1;

                    solve(col+1);

                    board[row][col] = '.';
                    leftRow[row] = 0;
                    lowerDiagonal[row+col] = 0;
                    upperDiagonal[(n-1) + (col - row)] = 0;
            }
        }
    }
    

    public static void main(String[] args) {
        solve(0);
    }
}
