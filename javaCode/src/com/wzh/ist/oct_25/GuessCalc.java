package com.wzh.ist.oct_25;

import java.util.ArrayList;
import java.util.List;

//用1-9 填写  ??X??  = ??X???
public class GuessCalc {
    public static void main(String[] args) {
        List<List<Integer>> list= new ArrayList<>();

        List<Integer> arr = new ArrayList<>();
        boolean[] choose = new boolean[9];
        guessCal(9,0,choose,arr,list);


        for (List<Integer> integers : list) {
            int l1 = integers.get(0)*10+integers.get(1);
            int l2 = integers.get(2)*10+integers.get(3);
            int r1 = integers.get(4)*10+integers.get(5);
            int r2 = integers.get(6)*100+integers.get(7)*10+integers.get(8);

            if (l1*l2 == r1*r2){
                System.out.println(l1+" x "+l2+" = "+r1+" x "+r2);
            }
        }
    }

    private static void guessCal(int len, int deepth, boolean[] choose, List<Integer> arr, List<List<Integer>> list) {
        if (deepth == len){
            list.add(new ArrayList<>(arr));
            return;
        }

        for (int i =0;i<len;i++){
            if (!choose[i]){
                choose[i] = true;
                arr.add(i+1);
                guessCal(len,deepth+1,choose,arr,list);
                choose[i] = false;
                arr.remove(arr.size()-1);
            }
        }

    }


}
