/*
 * @Author: Yilsi
 * @Date: 2022-11-08 02:35:48
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-08 02:36:17
 * @FilePath: \JAVA\作业20221108\k05.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class k05 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FilpFlop");
            } else if (i % 5 == 0) {
                System.out.println("Flop");
            } else if (i % 3 == 0) {
                System.out.println("Filp");
            } else {
                System.out.println(i);
            }
        }
    }

}
