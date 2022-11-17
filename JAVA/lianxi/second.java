
/*
 * @Author: Yilsi
 * @Date: 2022-11-17 16:09:16
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-17 19:19:26
 * @FilePath: \JAVA\lianxi\second.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        // 托运计费
        Scanner input = new Scanner(System.in);
        System.out.println("请输入托运物品的重量：");
        double weight = input.nextDouble();
        // 重量小于等于0
        if (weight <= 0) {
            System.out.println("重量为0，不需要托运");
            // 当货物重量小于20 公斤的时候，收费5 元
        } else if (weight <= 20) {
            System.out.println("托运费为5元");
            // 大于20 公斤小于100 公斤的时,超出20 公斤的部分按每0.2 元每公斤计费
        } else if (weight >= 20 && weight <= 100) {
            System.out.println("托运费为" + ((weight - 20) * 0.2 + 5) + "元");
            // 大于100 公斤的时候，超出100 公斤的部分按每0.15 元每公斤计费
        } else if (weight > 100) {
            System.out.println("托运费为" + ((weight - 100) * 0.15 + 5 + 16) + "元");
        }
        input.close();
    }
}
