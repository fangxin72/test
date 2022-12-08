
/*
 * @Author: Yilsi
 * @Date: 2022-12-01 14:21:02
 * @LastEditors: Fx
 * @LastEditTime: 2022-12-01 17:33:14
 * @FilePath: \JAVA\day11\shss.java
 * @Description: I don't know.
 * Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * Copyright (c) 2022 by Fx, All Rights Reserved.
 */

public class shss {

    // 创建学生数组
    public String[] names = new String[20];

    // 在保存学生姓名的数组中，指定查找区间，查找某个学生姓名是否存在，显示查找结果
    public void search(String name, int start, int end) {
        // 保存查找结果
        boolean flag = false;
        // 遍历数组
        for (int i = start; i < end; i++) {
            // 判断是否存在
            if (name.equals(names[i])) {
                flag = true;
                break;
            }
        }
        // 输出结果
        if (flag) {
            System.out.println("找到了");
        } else {
            System.out.println("没找到");
        }
    }

    // 增加学员姓名
    public void addName(String name) {
        boolean isAdd = true;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                isAdd = true;
                names[i] = name;
                break;
            }
        }
        if (isAdd) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    // 在保存了多个学生的数组中，指定查找区间，查找某个学生姓名并显示是否查找成功
    public static void main(String[] args) {
        shss StudentBiz = new shss();
        StudentBiz.addName("张三");
        StudentBiz.addName("李四");
        StudentBiz.addName("王五");
        StudentBiz.addName("赵六");
        StudentBiz.addName("田七");
        StudentBiz.addName("孙八");
        StudentBiz.addName("周九");
        StudentBiz.addName("吴十");
        StudentBiz.addName("郑十一");
        StudentBiz.addName("王十二");
        StudentBiz.addName("李十三");
        StudentBiz.addName("张十四");
        StudentBiz.addName("李十五");
        StudentBiz.addName("王十六");
        for (int i = 0; i < StudentBiz.names.length; i++) {
            System.out.println(StudentBiz.names[i] + "\t");
        }
    }

    public static void main(String[] args) {
        shss studentBiz = new shss();
        student zs = new student();
        zs.name = "张三";
        zs.age = 18;
        studtentBiz.addStudent(zs);
        studentBiz.students[0].showInfo();
    }
}
