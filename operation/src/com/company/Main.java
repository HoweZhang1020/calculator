package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner();
        Double first_num=0.0;
        String oc=null;
        Double second_num=0.0;

        //输入第一个数字
        System.out.println("请输入数字");
        for(i=1;i==1;){
            try{
                first_num=Double.parseDouble(scanner.nextLine().trim());
                i=0;
            }catch (Exception e){
                System.out.println("输入数字不合法请重新输入");
                i=1;
            }
        }

        //输入运算符
        System.out.println("请输入运算符");
        for(i=1;i==1;){
            String regEx="[+-*/]";
            Pattern pattern=new Pattern(regEx);
            Matcher matcher = pattern.matcher(oc);

            if(matcher.matches()){
                i=0;
            }else {
                System.out.println("输入运算符不合法请重新输入");
                i=1;
            }
        }

        //输入第二个数字
        System.out.println("请输入数字");
        for(i=1;i==1;){
            try{
                second_num=Double.parseDouble(scanner.nextLine().trim());
                i=0;
            }catch (Exception e){
                System.out.println("输入数字不合法请重新输入");
                i=1;
            }
        }

    }
}
