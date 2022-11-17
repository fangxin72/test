/*
 * @Author: Yilsi
 * @Date: 2022-11-17 17:15:33
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-17 17:25:35
 * @FilePath: \JAVA\lianxi\eighth.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class eighth {
    public static void main(String[] args) {
        // 冒泡排序:现有如下数组{100,50,60,755,66,10}
        int[] arr = { 100, 50, 60, 755, 66, 10 };
        // 冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            // 从小到大排序
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果前面的数比后面的数大，交换位置
                if (arr[j] > arr[j + 1]) {
                    // 交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // 输出
            System.out.print(arr[i] + " ");
        }
    }
}
