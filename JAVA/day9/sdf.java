
/*
 * @Author: Yilsi
 * @Date: 2022-11-17 14:44:13
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-21 14:49:03
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
            switch (choice) {
                case 1:
                    System.out.println("1.我要订餐");
                    for (int i = 0; i < dishNames.length; i++) {
                        System.out.println((i + 1) + "." + dishNames[i] + " " + dishPrices[i] + "元");
                    }
                    System.out.println("请输入订餐人的姓名：");
                    names[i] = input.next();
                    System.out.println("序号\t菜名\t单价\t点赞数");
                    for (int j = 0; j < dishNames.length; j++) {
                        System.out.println((j + 1) + "." + dishNames[j] + "\t" + dishPrices[j] + "元");
                    }
                    System.out.println("请选择要点的菜品编号：");
                    int no = input.nextInt();
                    System.out.println("请选择要点的份数：");
                    int count = input.nextInt();
                    dishMegs[i] = dishNames[no - 1] + count + "份";
                    double dishPrice = dishPrices[no - 1] * count;
                    double deliPrice = dishPrice >= 50 ? 0.0 : 5.0;
                    sumMoney[i] = dishPrice + deliPrice;
                    System.out.println("送餐时间(送餐时间是10点到20点之间整点送餐)：");
                    times[i] = input.nextInt();
                    System.out.println("请输入送餐地址：");
                    address[i] = input.next();
                    states[i] = 1;
                    System.out.println("订餐成功！您的订单为：");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("查看餐袋");
                    System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态");
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null) {
                            String stateStr = states[i] == 0 ? "已完成" : "已预订;";
                            System.out.println((i + 1) + "\t" + names[i] + "\t" + dishMegs[i] + "\t" + times[i] + "\t"
                                    + address[i] + "\t" + sumMoney[i] + "\t" + states[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("签收订单");
                    break;
            }
        }
    }
}
