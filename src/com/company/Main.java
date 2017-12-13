package com.company;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
//        System.out.print("Hello World     ");
//        System.out.println("HelloWorld"+"你好世界");
//        System.out.println("HelloWorld"+"99");
//        System.out.println("HelloWorld"+99);
//        System.out.println("Hello World");
//        System.out.print(198%10);
//        float num1 =2/3f;
//        double num2 =2/3d;
//        //num = 2/3;
//        System.out.print(num1);
//        System.out.print( num2);
//        String myName = "小样";
//        String mySex = "男";
//        String myBirthday = "1991.07.27";
//        int myAge = 15;
//        System.out.println("姓名     性别        生日           年龄");
//        System.out.println(myName + "     " + mySex + "          " + myBirthday + "     " + myAge);
//        int dayCount = 10;
//        int hourCount = 24;
//        int minCount = 60;
//        System.out.println(dayCount +"天共有" + hourCount * dayCount + "个小时,共有"+hourCount * dayCount*minCount+"分钟。" );
//        int aCount;
//        aCount = 2000;
//        double bbbbbb = 10/0.0;
//        System.out.println(bbbbbb);
//        System.out.println("千位数字是："+aCount/1000+"，百位数字是："+aCount/100%10 + "，十位数字是："+aCount/10%10+"，个位数字是："+aCount%10+"。");
//        int hourcount  = 240;
//        int daycount = hourcount / 24;
//        int hournum = hourcount % 24;
//        System.out.println(daycount);
//        System.out.println(hournum);
//        System.out.println(hournum+"   "+daycount);
        double randomnum = Math.random();
        int oneAge = (int) randomnum * 100;
        if (oneAge >= 60){
            System.out.println("老年人");
        }
        else if (oneAge >= 40){
            System.out.println("中年人");
        }
        else if (oneAge >= 20){
            System.out.println("青年人");
        }
        else if (oneAge >= 10){
            System.out.println("青少年");
        }
        else{
            System.out.println("儿  童");
        }
    }
}