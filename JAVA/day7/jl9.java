
import java.util.*;

/*
 * @Author: Yilsi
 * @Date: 2022-11-10 14:18:05
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-10 19:52:07
 * @FilePath: \笔记c:\VSCode\JAVA\day7\jl9.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class jl9 {
    public static void main(String[] args) {
        int scores[];

        scores = new int[5];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;
        scores[4] = 50;
        System.out.println(scores[3]);

        // 声明数组
        int[] score2 = { 10, 20, 30, 40, 50 };
        int[] score3 = new int[] { 10, 20, 30, 40, 50 };
        // []不能写上长度
        System.out.println(score2[0]);

        System.out.println(score3[2]);
        System.out.println("scores的数组长度是" + scores.length);

        try (Scanner input = new Scanner(System.in)) {
            int sum = 0;
            for (int i = 0; i < scores.length; i++) {
                System.out.println("请输入数组中下标位置" + i + "的数组元素");
                scores[i] = input.nextInt();
                sum += scores[i];
            }
            System.out.println("数组中所有元素的平均是" + sum * 1.0 / scores.length);
        }
        for (int i = 0; i < score2.length; i++) {
            System.out.println(scores[i]);
        }
        for (int score : scores) {
            System.out.println(score + "\t");
        }

    }
}
