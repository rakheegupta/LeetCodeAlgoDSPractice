package com.datastructure.day4;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsList = new ArrayList<List<Integer>>();

        if(numRows ==0)
            return null;

        //initialize
        List<Integer> prev = new ArrayList<>(1);
        prev.add(1);
        pascalsList.add(prev);

        while(numRows > 1)
        {
            List<Integer> next = new ArrayList<>(prev.size()+1);
            next.add(0,1);

            for(int i=1;i<prev.size();i++){
                next.add(i,prev.get(i-1) + prev.get(i));
            }

            next.add(next.size(),1);

            pascalsList.add(next);
            prev = next;
            numRows--;
        }
        return pascalsList;
    }

    @Test
    public void test1(){
        int rows=6;
        System.out.println(generate(rows));
    }
}
