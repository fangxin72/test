
/*
 * @Author: Yilsi
 * @Date: 2022-11-17 13:57:26
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-17 14:04:53
 * @FilePath: \JAVA\day9\cvbh.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
import java.util.Scanner;

public class cvbh {
    public static void main(String[] args) {
        int score[][];
        score = new int[3][5];
        score[0][0] = 12;
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(nums[2][0]);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的成绩");
                score[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的成绩是" + score[i][j]);
            }
        }
        input.close();
    }
}
