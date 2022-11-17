/*
 * @Author: Yilsi
 * @Date: 2022-11-17 16:26:40
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-17 17:24:23
 * @FilePath: \JAVA\lianxi\third.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class third {
    public static void main(String[] args) {
        // 打印1000-9999之间的回文数
        for (int i = 1000; i < 10000; i++) {
            // 个位
            int a = i / 1000;
            // 十位
            int b = i / 100 % 10;
            // 百位
            int c = i / 10 % 10;
            // 千位
            int d = i % 10;
            if (a == d && b == c) {
                System.out.println(i);
            }
        }
    }
}
