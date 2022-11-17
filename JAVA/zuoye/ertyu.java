
/*
 * @Author: Yilsi
 * @Date: 2022-11-14 19:18:10
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-14 19:21:52
 * @FilePath: \JAVA\zuoye\ertyu.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
import java.util.Scanner;

public class ertyu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入4句话：");
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            System.out.println("第" + (i + 1) + "句话");
            names[i] = input.next();
        }
        System.out.println("逆序输出4句话为：");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);

        }
        input.close();
    }

}
