
/*
 * @Author: Yilsi
 * @Date: 2022-11-10 16:45:31
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-10 17:17:14
 * @FilePath: \JAVA\day7\ertyui.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
import java.util.*;

@SuppressWarnings("unused")
public class ertyui {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int shuzi[] = { 8, 4, 2, 1, 23, 344, 12 };
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a = input.nextInt();
        boolean flag = false;
        for (int i = 0; i < shuzi.length; i++) {
            if (a == shuzi[i]) {
                flag = true;
                break;
            }
        }
        input.close();
    }
}
