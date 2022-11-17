/*
 * @Author: Yilsi
 * @Date: 2022-11-17 16:53:01
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-17 16:54:29
 * @FilePath: \JAVA\lianxi\fifth.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class fifth {
    public static void main(String[] args) {
        // 打印菱形
        for (int s_1 = 1; s_1 <= 5; s_1++) {
            // 打印空格
            for (int h_1 = 1; h_1 <= 5 - s_1; h_1++) {
                System.out.print(" ");
            }
            // 打印/
            for (int m_1 = 1; m_1 <= 2 * s_1 - 1; m_1++) {
                System.out.print("/");
            }
            // 换行
            System.out.println();
        }
        // 下半部分
        for (int s_2 = 1; s_2 <= 4; s_2++) {
            // 打印空格
            for (int h_2 = 1; h_2 <= s_2; h_2++) {
                System.out.print(" ");
            }
            // 打印/
            for (int m_2 = 1; m_2 <= 9 - 2 * s_2; m_2++) {
                System.out.print("/");
            }
            // 换行
            System.out.println();
        }
    }
}
