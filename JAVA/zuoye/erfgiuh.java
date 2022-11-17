
/*
 * @Author: Yilsi
 * @Date: 2022-11-14 19:20:08
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-14 19:20:46
 * @FilePath: \JAVA\zuoye\erfgiuh.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
import java.util.Scanner;

public class erfgiuh {
    public static void main(String[] args) {
        int[] price = new int[4];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < price.length; i++) {
            System.out.println("请输入第" + (i + 1) + "家店的价格");
            price[i] = input.nextInt();
        }
        int min = price[0];
        for (int i = 1; i < price.length; i++) {
            // 如果最大值比数组元素小的情况下
            if (price[i] < min) {
                // 最大值进行重新赋值
                min = price[i];
            }
        }
        System.out.println("最小值是" + min);
        input.close();
    }

}
