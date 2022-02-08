package com.datastructure.day5;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class ValidSuDoku {
    // Array hashtable matrix
    public boolean isValidSudoku(char[][] board) {

        Set<Character> row = new HashSet<Character>(9);
        Set<Character> col = new HashSet<Character>(9);


        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {

                if(board[i][j]=='.')
                    continue;

                //check each row
                if(row.contains(board[i][j]))
                    return false;
                row.add(board[i][j]);

                //check each column
                if(col.contains(board[j][i]))
                    return false;
                col.add(board[j][i]);
            }
            row.clear();
            col.clear();
        }

        //check each 3x3 cell
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(!check(board,i*3, j*3))
                    return false;
            }
        }
//            for(int i=0;i<7;i+=3)
//                for(int j=0;j<7;j+=3)
//                    if(!check(board,i, j))
//                    return false;

        return true;
    }

    //check each 3x3 cell
    boolean check(char[][] board,int r,int c) {
        Set<Character> cell = new HashSet<Character>(9);
        for(int i=r;i<r+3;i++) {
            for(int j=c;j<c+3;j++){
                if(cell.contains(board[i][j]))
                    return false;
                if(board[i][j]!='.')
                    cell.add(board[i][j]);
            }
        }
        return true;
    }

    @Test
    public void test1() {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }
}
