
/*
 * @Author: error: git config user.name && git config user.email & please set dead value or install git
 * @Date: 2022-11-07 14:22:45
 * @LastEditors: error: git config user.name && git config user.email & please set dead value or install git
 * @LastEditTime: 2022-11-07 15:10:17
 * @FilePath: \JAVA\day6\chengji.java
 * @Description:
 *
 * Copyright (c) 2022 by error: git config user.name && git config user.email & please set dead value or install git, All Rights Reserved.
 */
import java.util.*;

public class chengji {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("请输入学生姓名");
            double sum = 0.0;
            for (int i = 1; i <= 5; i++) {
                System.out.println("输入第" + i + "的成绩");
                double score = input.nextDouble();
                if (score < 0) {
                    System.out.println("抱歉，分数录入错误");
                    break;
                }
                sum += score;
            }
            double avg = sum / 5.0;
            System.out.println("平均分是" + avg);
        }

    }
}
