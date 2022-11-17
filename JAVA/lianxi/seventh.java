/*
 * @Author: Yilsi
 * @Date: 2022-11-17 16:58:23
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-17 17:14:27
 * @FilePath: \JAVA\lianxi\seventh.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class seventh {
    public static void main(String[] args) {
        // 创建一个长度为13的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时要求元素的值各不相同
        int[] arr = new int[13];
        // 随机赋值 1-30
        for (int i = 0; i < arr.length; i++) {
            // 生成随机数
            arr[i] = (int) (Math.random() * 30 + 1);
            // 判断是否重复
            for (int j = 0; j < i; j++) {
                // 如果重复，重新赋值
                if (arr[i] == arr[j]) {
                    // 重新赋值
                    i--;
                    // 跳出循环
                    break;
                }
            }
            // 输出
            System.out.print(arr[i] + " ");
            // 换行
            if (i % 5 == 4) {
                System.out.println();
            }
        }
    }
}
