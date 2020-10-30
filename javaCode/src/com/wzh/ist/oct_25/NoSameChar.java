package com.wzh.ist.oct_25;

import java.util.Scanner;


/*
    检查字符串中有没有重复字符
 */
public class NoSameChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=  sc.nextLine();
        System.out.println(new NoSameChar().new Solution().isUnique(s));
    }

    class Solution {
        public boolean isUnique(String astr) {
            long small = 0;
            long big = 0;
            char[] chars = astr.toCharArray();
            for(char c:chars){
                if(c<64){
                    small &= (1<<(64-c));
                    if(small!=0) return false;
                    small += (1<<(64-c));
                }else{
                    big &= (1<<(c-63));
                    if(big!=0) return false;
                    big += (1<<(c-63));
                }
            }
            return true;
        }
    }
}
