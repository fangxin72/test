/*
 * @Author: Yilsi
 * @Date: 2022-11-17 16:50:55
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-17 16:56:39
 * @FilePath: \JAVA\lianxi\sixth.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class sixth {
    public static void main(String[] args) {
        // 百钱百鸡问题
        int x, y, z;
        // 公鸡
        for (x = 0; x <= 20; x++) {
            // 母鸡
            for (y = 0; y <= 33; y++) {
                // 小鸡
                z = 100 - x - y;
                // 判断是否满足条件
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    // 输出结果
                    System.out.println("公鸡：" + x + "只，母鸡：" + y + "只，小鸡：" + z + "只");
                }
            }
        }
    }
}
