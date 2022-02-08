package com.datastructure.day5;

import org.junit.Test;

public class SearchIn2dArray
{
    public boolean searchMatrix(int[][] matrix, int target) {
        return binarySearchMatrix(matrix,target,0,matrix.length * matrix[0].length -1);
    }

    boolean binarySearchMatrix(int[][] matrix, int target,int start, int end) {
        if(start > end)
            return false;
        int mid = start + (end-start)/2;
        int col = matrix[0].length;
        if (matrix[mid/col][mid%col] == target)
            return true;
        if (matrix[mid/col][mid%col] > target)
            return binarySearchMatrix(matrix,target,start,mid-1);
        return binarySearchMatrix(matrix,target,mid+1,end);
    }

    @Test
    public void test1(){
        int[][] matrix ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=-65;
        System.out.println(searchMatrix(matrix,target));
        assert (searchMatrix(matrix, target));
    }
}
