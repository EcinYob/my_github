package com.wzh.ist.everyday;


import java.util.*;
class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        int cover = 0;
        for(int i =0;i<grid.length;++i){
            for (int j = 0;j<grid[0].length;++j){
                if (grid[i][j]==1){
                    sum ++;
                    if (i-1>=0 && grid[i-1][j] == 1) ++cover;
                    if(j-1>=0 && grid[i][j-1] == 1 ) ++ cover;
                }
            }
        }
        return sum*4-cover*2;
    }




}