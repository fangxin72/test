/*
 * @Author: Yilsi
 * @Date: 2022-11-17 16:27:08
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-17 16:53:52
 * @FilePath: \JAVA\lianxi\fourth.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class fourth {
    public static void main(String[] args) {
        // 猴子吃桃问题
        int Tao_ = 1;
        // 从第10天开始
        for (int i = 0; i < 9; i++) {
            Tao_ = (Tao_ + 1) * 2;
        }
        System.out.println(Tao_);
    }
}
