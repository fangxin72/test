/*
 * @Author: Yilsi
 * @Date: 2022-12-01 13:59:10
 * @LastEditors: Fx
 * @LastEditTime: 2022-12-01 14:20:49
 * @FilePath: \JAVA\day11\rgh.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class rgh {
    public void zhazhi(String zzj) {
        System.out.println(zzj + "汁");
    }

    // 带参数的构造方法：访问权限修饰符 类名(参数列表){}
    public void zhazhi(String zzj, int count) {
        System.out.println(count + "个" + zzj + "汁");
    }

    // 在定义方法时，参数列表里的参数没有实际的值，只是一个占位符，用来接收实际的值
    // 在调用方法时，实际的值会传递给参数列表里的参数，这个过程叫做参数传递
    // 参数传递的方式：值传递
    // 值传递：实际的值会复制一份给参数列表里的参数，这个过程叫做值传递
    // 值传递的特点：实际的值不会影响到参数列表里的参数
    // 实参列表需要和形参列表一一对应
    // 包括参数的个数、参数的类型、参数的顺序
    public static void main(String[] args) {
        rgh zzj = new rgh();
        zzj.zhazhi("m", 2);
    }
}
