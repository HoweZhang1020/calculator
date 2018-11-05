package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入");
        String input=scanner.nextLine();

        String num_regEx="[*+-/]";
        String oc_regEx="\\d+";

        String []nums_strs=input.split(num_regEx);
        String []oc_strs=input.split(oc_regEx);

        if(nums_strs.length-oc_strs.length!=1){

        }
        //判断运算符是否有非运算符
        for(String tmp:oc_strs){
            if (Pattern.matches(oc_regEx,tmp)==true){
                System.out.println("输入错误");
                break;
            }
        }
        //判断数字数组是否有非数字
        for(String tmp:nums_strs){
            if (Pattern.matches(num_regEx,tmp)==true){
                System.out.println("输入错误1");
                break;
            }
        }

        //运算函数
        for(int i=0;i<oc_strs.length-1;i++){
            if(Pattern.matches("[*/]",oc_strs[i])){
                switch (oc_strs[i]){
                    case "*":
                        nums_strs[i]=String.valueOf(Double.valueOf(nums_strs[i])*Double.valueOf(nums_strs[i+1]));
                        nums_strs[i+1]=nums_strs[i];
                        break;
                    case "/":
                        nums_strs[i]=String.valueOf(Double.valueOf(nums_strs[i])/Double.valueOf(nums_strs[i+1]));
                        nums_strs[i+1]=nums_strs[i];
                        break;
                }
            }
        }

        int index=0;
        for(int i=0;i<oc_strs.length-1;i++){
            if(Pattern.matches("[+-]",oc_strs[i])){
                index=i;
                switch (oc_strs[i]){
                    case "+":
                        nums_strs[i]=String.valueOf(Double.valueOf(nums_strs[i])+Double.valueOf(nums_strs[i+1]));
                        nums_strs[i+1]=nums_strs[i];
                        break;
                    case "-":
                        nums_strs[i]=String.valueOf(Double.valueOf(nums_strs[i])-Double.valueOf(nums_strs[i+1]));
                        nums_strs[i+1]=nums_strs[i];
                        break;
                }
            }
        }

        System.out.println(input+"的结果为："+nums_strs[index]);

    }
}
