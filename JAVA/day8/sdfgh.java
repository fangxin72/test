/*
 * @Author: Yilsi
 *
 * @Date: 2022-11-14 13:46:18
 *
 * @LastEditors: Fx
 *
 * @LastEditTime: 2022-11-14 14:18:15
 *
 * @FilePath: \JAVA\day8\sdfgh.java
 *
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non
 * caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class sdfgh {
    public static void main(String[] args) {
        int[] nums = { 16, 25, 9, 90, 23 };
        // 外层循环控制比较的轮数
        for (int i = 0; i < nums.length - 1; i++) {
            // 内层循环控制每一轮比较的次数
            for (int j = 0; j < nums.length; j++) {
                // 如果前面的数比后面的数大，就交换
                if (nums[j] > nums[j + 1]) {
                    // 交换
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后的数组");
        for (int num : nums) {
            System.out.println(num);
        }
    }
}