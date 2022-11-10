/*
 * @Author: Yilsi
 * @Date: 2022-11-08 02:29:09
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-08 02:35:06
 * @FilePath: \JAVA\作业20221108\k03.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class k03 {
    public static void main(String[] args) {
        for (int chickenNum = 0; chickenNum <= 35; chickenNum++) {
            int rabbitNum = 35 - chickenNum;
            if (2 * chickenNum + 4 * rabbitNum == 94) {
                System.out.println("鸡有" + chickenNum + "兔有" + rabbitNum);
            }
        }
    }

}
