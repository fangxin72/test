
/*
 * @Author: Yilsi
 * @Date: 2022-11-10 17:05:56
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-10 17:12:20
 * @FilePath: \JAVA\day7\efwds.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
import java.util.Scanner;

public class efwds {
    public static void main(String[] args) {
        int[] scores = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩");
            scores[i] = input.nextInt();
        }
        // 假设最大值为元素数组中的第一个元素
        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        System.out.println("最高分为：" + maxScore);
        input.close();
    }
}
