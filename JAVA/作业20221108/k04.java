/*
 * @Author: Yilsi
 * @Date: 2022-11-08 02:36:54
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-08 02:37:27
 * @FilePath: \JAVA\作业20221108\k04.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
public class k04 {
    public static void main(String[] args) {
        int male;
        int female;
        int chridren;
        for (male = 0; male <= 10; male++) {
            for (female = 0; female < 30; female++) {
                chridren = 30 - male - female;
                if (3 * male + 2 * female + chridren == 50) {
                    System.out.println("男人的人数为：" + male);
                    System.out.println("女人的人数为" + female);
                    System.out.println("小孩的人数为：" + chridren);
                }
            }
        }

    }
}
