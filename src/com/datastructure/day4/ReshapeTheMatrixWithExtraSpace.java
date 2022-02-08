package com.datastructure.day4;

import org.junit.Test;


public class ReshapeTheMatrixWithExtraSpace {

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if(mat.length ==r && mat[0].length == c ||
            r*c != mat.length*mat[0].length)
            return mat;

        int[][] out = new int[r][c];
        int[] intermediate = new int[r*c];

        fillup(intermediate,mat);

        setup(out,intermediate);

        return out;
    }

    void setup(int[][] out, int[] inter){
        int i=0;
        for(int j=0;j<out.length;j++)
            for(int k=0;k<out[j].length;k++)
                out[j][k]=inter[i++];
    }

    void fillup(int[] intermediate,int[][] mat) {
        int i=0;
        for (int j=0;j<mat.length;j++)
            for(int k=0;k<mat[j].length;k++)
                intermediate [i++]=mat[j][k];
    }

    @Test
    public void test1() {
        int[][] input ={{1,2},{3,4}};
        int r=4;
        int c=2;
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
