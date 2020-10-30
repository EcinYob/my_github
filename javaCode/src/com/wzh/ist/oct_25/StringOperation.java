package com.wzh.ist.oct_25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
    首字母大写
    数字和字母中间 _连接
    删除多空格
 */
public class StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println("你输入的是"+st);
        st = st.trim();
        List<Character> list = new ArrayList<>();
        operation(st,list);
        String ans ="";
        while(!list.isEmpty()){
            ans += String.valueOf(list.remove(0));
        }

        System.out.println("处理后的结果是"+ans);
    }

    private static void operation(String st, List<Character> list) {
        char[] chars = st.toCharArray();
        int len = chars.length,index=0;
        while(index<len){
            if (index ==0 && chars[index]>='a'&&chars[index]<='z'){
                list.add((char)(chars[index]-32)) ;
            }else if(chars[index]==' '&& chars[index-1]==' '){
                index++;
                continue;
            }else if (chars[index]>='0'&&chars[index]<='9' && (chars[index-1]>='A' &&chars[index-1]<='Z'|| chars[index-1]>='a' &&chars[index-1]<='z')){
                list.add('_');
                list.add(chars[index]);
            }else if (chars[index-1]>='0'&&chars[index-1]<='9' &&( chars[index]>='A' &&chars[index]<='Z'||chars[index]>='a' &&chars[index]<='z')){
                list.add('_');
                list.add(chars[index]);
            }else{
                list.add(chars[index]);
            }
            index++;
        }
    }
}
