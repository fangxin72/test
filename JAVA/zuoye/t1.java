/*
 * @Author: Yilsi
 * @Date: 2022-10-29 07:07:54
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-10 14:16:02
 * @FilePath: \JAVA\zuoye\t1.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class t1 {
    public static void main(String[] args) {
        System.out.println("10和8交换");
        int a = 10;
        int b = 8;
        int c;
        System.out.println("左手为：" + a);
        System.out.println("右手为：" + b);
        c = b;
        b = a;
        a = c;
        System.out.println("交换结果左手为：" + a);
        System.out.println("交换结果右手为: " + b);
    }
}