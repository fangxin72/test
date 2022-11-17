
/*
 * @Author: Yilsi
 * @Date: 2022-11-17 14:44:13
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-17 15:21:15
 * @FilePath: \JAVA\day9\sdf.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
import java.util.Scanner;

public class sdf {
    public static void main(String[] args) {
        // 订单信息：序号 订餐人 餐品信息 送餐时间 送餐地址 订单金额 订单状态
        String names[] = new String[4];// 订餐人
        String dishMegs[] = new String[4];// 餐品信息
        int[] times = new int[4];// 送餐时间
        String[] address = new String[4];// 送餐地址
        double[] sumMoney = new double[4];// 订单金额
        int states[] = new int[4];// 订单状态
        // 初始化订单信息
        String dishNames[] = { "红烧带鱼", "鱼香肉丝", "时令蔬菜" };
        double dishPrices[] = { 38.0, 20.0, 10.0 };
        int dishStates[] = { 0, 0, 0 };
        // 初始化订餐人信息
        names[0] = "斌斌";
        dishMegs[0] = "红烧带鱼1000份";
        times[0] = 12;
        address[0] = "南信大明想楼405旁边厕所";
        sumMoney[0] = dishPrices[2] * 1000;
        dishStates[0] = 1;

        names[1] = "小何";
        dishMegs[1] = "鱼香肉丝1000份";
        times[1] = 12;
        address[1] = "南信大明想楼305旁边厕所";
        sumMoney[1] = dishPrices[1] * 1000;
        dishStates[1] = 1;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("欢迎使用订餐系统");
            System.out.println("**********************************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("**********************************");
            System.out.println("请选择：");
            int choose = input.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("1.我要订餐");
                    break;
                case 2:
                    System.out.println("2.查看餐袋");
                    break;
                case 3:
                    System.out.println("3.签收订单");
                    break;
                case 4:
                    System.out.println("4.删除订单");
                    break;
                case 5:
                    System.out.println("5.我要点赞");
                    break;
                case 6:
                    System.out.println("退出系统");
                    break;
                    isExit = ture;
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
            if (!isExit) {
                System.err.println("输入0返回上一级菜单");
                num = input.nextInt();
            } else {
                break;
            }
            while (num == 0)
                ;
        }
    }
}
