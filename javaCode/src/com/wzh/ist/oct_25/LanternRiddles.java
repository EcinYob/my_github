package com.wzh.ist.oct_25;

import java.util.*;

public class LanternRiddles {
        Map<Integer,Integer> map = new HashMap<>();
        public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
            List<Integer> ans = new Vector<>();
            for (String word : words) {
                changeIntoNum(word,true);
            }
            for (String puzzle : puzzles) {
                char key = puzzle.charAt(0);
                int num = changeIntoNum(puzzle,false),can = 0;
                for(int i =num;i>0;i=(i-1)&num){
                    if (((1<<(key-'a'))&i)!=0) can+= map.getOrDefault(i,0);
                }
                ans.add(can);
            }
            return ans;
        }

        public int changeIntoNum(String s,boolean is){
            int num = 0;
            for (int i = 0; i < s.length(); i++) {
                num |= 1 << (s.charAt(i) - 'a');
            }
            if (is){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            return num;
        }
}
