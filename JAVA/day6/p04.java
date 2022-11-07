/*
 * @Author: error: git config user.name && git config user.email & please set dead value or install git
 * @Date: 2022-11-07 14:44:00
 * @LastEditors: error: git config user.name && git config user.email & please set dead value or install git
 * @LastEditTime: 2022-11-07 15:15:46
 * @FilePath: \JAVA\day6\p04.java
 * @Description:
 *
 * Copyright (c) 2022 by error: git config user.name && git config user.email & please set dead value or install git, All Rights Reserved.
 */
public class p04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println("当前数是" + sum);
                System.out.println("当前i的值“+i");
                break;
            }
        }
    }
}
