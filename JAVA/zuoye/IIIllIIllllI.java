
/*
 * @Author: Yilsi
 * @Date: 2022-11-14 18:59:21
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-14 19:19:34
 * @FilePath: \JAVA\zuoye\IIIllIIllllI.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */
import java.util.Scanner;

public class IIIllIIllllI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] musics = new String[] { "Island", "Ocean", "Pretty", "Sun" };
        String[] nummusics = new String[musics.length + 1];
        int index = 0;
        String music = "";
        System.out.print("插入前的数组:");
        for (int i = 0; i < musics.length; i++) {
            nummusics[i] = musics[i];
        }
        for (int i = 0; i < musics.length; i++) {
            System.out.print(musics[i] + " ");
        }
        System.out.println("");
        System.out.print("请输入新的单词");
        music = input.nextLine();
        System.out.print("插入前新单词的下标:");
        for (int i = 0; i < nummusics.length; i++) {
            if (nummusics[i].compareToIgnoreCase(music) > 0) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        for (int i = nummusics.length - 1; i > index; i--) {
            nummusics[i] = nummusics[i - 1];
        }
        nummusics[index] = music;
        System.out.print("插入后的数组:");
        for (int i = 0; i < nummusics.length; i++) {
            System.out.print(nummusics[i] + " ");
        }
        input.close();
    }

}
