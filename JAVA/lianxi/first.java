
/*
 * @Author: Yilsi
 * @Date: 2022-11-17 16:02:15
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-17 16:10:54
 * @FilePath: \JAVA\lianxi\first.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        // 计算器
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int Number_One = input.nextInt();
        System.out.println("请输入第二个数：");
        int Number_Two = input.nextInt();
        System.out.println("请输入运算符（+,-,*,/）：");
        String OP = input.next();
        switch (OP) {
            case "+":
                System.out.println(Number_One + Number_Two);
                break;
            case "-":
                System.out.println(Number_One - Number_Two);
                break;
            case "*":
                System.out.println(Number_One * Number_Two);
                break;
            case "/":
                System.out.println(Number_One / Number_Two);
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        input.close();
    }
}
