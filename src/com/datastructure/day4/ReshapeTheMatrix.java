package com.datastructure.day4;

import org.junit.Test;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int matR = mat.length;
        int matC = mat[0].length;
        if((matR ==r && matC == c) ||
                (r*c != matR*matC))
            return mat;

        int[][] output = new int[r][c];
        int matI=0,matJ=0;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++) {
                output[i][j] = mat[matI][matJ];
                if(matJ == matC -1)
                {
                    matJ=0;
                    matI++;
                }
                else
                    matJ++;
            }
        return output;
    }

    @Test
    public void test1() {
        int[][] input ={{1,2},{3,4}};
        int r=1;
        int c=4;
        printArray(matrixReshape(input,r,c));
    }

    void printArray(int[][] mat){
        if(mat==null)
            return;
        for(int i=0;i<mat.length;i++)
            printArray(mat[i]);
    }

    void printArray(int [] nums) {
        if(nums==null)
            return;
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
    }


}
