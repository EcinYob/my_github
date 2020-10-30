package com.wzh.ist;

import java.lang.reflect.Array;
import java.util.*;


//全排列  广度优先算法

    class Question1 {
        private static int num = 0;
        public static void main(String[] args) {
            Scanner  sc = new Scanner(System.in);
            int n = sc.nextInt();
            List<List<Integer>> list = new Question1().getAll(n);
            System.out.println("一共有"+num);
            for (List<Integer> integers : list) {
                for (Integer integer : integers) {
                    System.out.print((char)('A'+integer));
                }
                System.out.println();
            }

        }


        public List<List<Integer>> getAll(int n){
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = i;
            }
            List<List<Integer>> ans = new ArrayList<>();
            if (n==0) return ans;

            boolean[] choose = new boolean[n];
            List<Integer> arr = new ArrayList<>();
            dps(n,nums,0,choose,arr,ans);
            return ans;
        }

        private void dps(int n, int[] nums, int deepth, boolean[] choose, List<Integer> arr, List<List<Integer>> ans) {
            if (n==deepth){
                num++;
                ans.add(new ArrayList<>(arr));
            }

            for (int i = 0; i < nums.length; i++) {
                if (!choose[i]){
                    choose[i] = true;
                    arr.add(nums[i]);
                    dps(n,nums,deepth+1,choose,arr,ans);

                    choose[i] = false;
                    arr.remove(arr.size()-1);
                }
            }
        }


    }

    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            int len  = nums.length;
            List<List<Integer>> res = new ArrayList<>();
            if (len == 0 ) return res;
            boolean[] choose = new boolean[len];
            List<Integer> path = new ArrayList<>();
            dps(len,nums,0,choose,path,res);
            return res;

        }

        private void dps(int len,int[]nums, int deepth, boolean[] choose, List<Integer> path, List<List<Integer>> res) {
            if (len == deepth){
                res.add(new ArrayList<>(path));
                return ;
            }

            for (int i = 0; i < len; i++) {
                if (!choose[i]){
                    choose[i] = true;
                    path.add(nums[i]);
                    dps(len,nums,deepth+1,choose,path,res);

                    choose[i]=false;
                    path.remove(path.size()-1);
                }
            }
        }


    }

