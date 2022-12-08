/*
 * @Author: Yilsi
 * @Date: 2022-11-29 22:14:18
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-29 22:16:27
 * @FilePath: \JAVA\day10\yhn.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */

import java.util.Scanner;

public class yhn {
    public String name;
    public int age;
    public double payMoney;

    public static void main(String[] args) {

        // 演示
        Scanner scanner = new Scanner(System.in);
        Vistitor visitor = new Vistitor();
        double payMoney = 0.0;
        do {
            System.out.println("输入n退出程序");
            System.out.print("请输入名字:");
            visitor.name = scanner.next();
            if ("n".equals(visitor.name)) {
                break;
            }
            System.out.print("请输入年龄:");
            visitor.age = scanner.nextInt();
            visitor.getTicketPrice();
            visitor.showInfo();
        } while (true);

        System.out.println("退出程序");
    }

    public double getTicketPrice() {
        if (age > 18) {
            payMoney = 20.0;
        } else {
            payMoney = 0.0;
        }
        return payMoney;
    }

    public void showInfo() {

        if (payMoney != 0) {
            System.out.println(name + " 年龄是:" + age + "\t " + " 付" + payMoney);
        } else {
            System.out.println(name + " 年龄是:" + age + " 免费");
        }
    }

}
