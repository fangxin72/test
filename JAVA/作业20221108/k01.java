
/*
 * @Author: Yilsi
 * @Date: 2022-11-08 02:09:11
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-08 02:25:41
 * @FilePath: \JAVA\作业20221108\k01.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
import java.util.*;

public class k01 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("输入一个整数（输入0结束）：");
            int num = input.nextInt();
            int max = num;
            int min = num;
            while (num != 0) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                System.out.print("输入一个整数（输入0结束）：");
                num = input.nextInt();
            }
            System.out.println("最大值：" + max + " 最小值：" + min);
        }

    }
}