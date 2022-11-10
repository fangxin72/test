
/*
 * @Author: Yilsi
 * @Date: 2022-11-08 02:26:22
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-08 02:27:05
 * @FilePath: \JAVA\作业20221108\k02.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
import java.util.*;

public class k02 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int day = 1;
            do {
                System.out.println("请输入数字1-7（输入0结束）:");
                day = input.nextInt();
                switch (day) {
                    case 1:
                        System.out.println("今天是 MON");
                        break;
                    case 2:
                        System.out.println("今天是 TUE");
                        break;
                    case 3:
                        System.out.println("今天是 WED");
                        break;
                    case 4:
                        System.out.println("今天是 THU");
                        break;
                    case 5:
                        System.out.println("今天是 FRI");
                        break;
                    case 6:
                        System.out.println("今天是 SAT");
                        break;
                    case 7:
                        System.out.println("今天是 SUN");
                        break;
                }
                if (day == 0) {
                    System.out.println("程序结束！");
                    break;
                } else if (day > 7 || day < 0) {
                    System.out.println("输入的数字非法，请重新输入：");
                }
            } while (day != 0);
        }
    }
}
