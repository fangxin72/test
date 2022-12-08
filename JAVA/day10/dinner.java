import java.util.Scanner;

public class dinner {
    public static void main(String[] args) {
        // 订单信息 :序号，订餐人，餐品信息，运餐时间，送餐地址，总金额，订单状态
        String names[] = new String[4];// 订餐人
        String disMegs[] = new String[4];// 餐品信息
        int[] times = new int[4];// 运餐时间
        String addresses[] = new String[4];// 送餐地址
        double sumMoneys[] = new double[4];// 总金额
        int states[] = new int[4];// 订单状态

        // 菜品信息（序号，菜名，单价，点餐数）
        String dishNames[] = { "宫保鸡丁", "帝王蟹", "红辣椒", "西红柿" };
        double prices[] = { 1, 5, 1, 1 };
        int[] counts = { 0, 0, 0, 0 };

        // 初始化2个订单信息
        names[0] = "123";
        disMegs[0] = "帝王蟹500份";
        times[0] = 12;
        addresses[0] = "汤臣一品";
        sumMoneys[1] = prices[2] * 500;
        states[1] = 0;

        names[0] = "何清语";
        disMegs[0] = "老八秘制 小汉堡500份";
        times[0] = 12;
        addresses[0] = "下水道";
        sumMoneys[1] = prices[0] * 500;
        states[1] = 1;

        int num = -1;// 循环变量
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎使用吃货联盟订餐系统");
        boolean isExit = false;// 是否退出系统的标识
        do {
            System.out.println("************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("***********");
            System.out.print("请选择:");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("***我要订餐***");
                    boolean isAdd = false;// 是否能够订餐的表示
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] == null) {
                            isAdd = true;
                            System.out.println("请输入订餐人姓名:");
                            names[i] = input.next();// 订餐人姓名
                            // 显示餐品信息
                            System.out.println("序号\t菜名\t单价\t点赞数");
                            for (int j = 0; j < dishNames.length; j++) {
                                System.out.println((j + 1) + "\t" + dishNames[j] + "\t" + prices[j] + "\t" + states[j]);
                            }
                            System.out.println("请选择菜品编号:");
                            int no = input.nextInt();
                            System.out.println("请选择您要点的份数");
                            int count = input.nextInt();
                            disMegs[i] = dishNames[no - 1] + count + "份";// 餐品信息
                            double dishPrice = prices[no - 1] * count;// 餐费
                            double deliPrice = dishPrice >= 50 ? 0.0 : 5.0;// 送餐费
                            sumMoneys[i] = dishPrice + deliPrice;// 总金额
                            System.out.println("请输入送餐时间(10-20之间的整点)");
                            times[i] = input.nextInt();// 送餐时间·
                            while (times[i] < 10 || times[i] > 20) {
                                System.out.println("请输入正确时间");
                                times[i] = input.nextInt();
                            }
                            System.out.println("请输入送餐地址");
                            addresses[i] = input.next();// 送餐地址
                            states[i] = 1;// 状态默认已预订
                            System.out.println("订餐成功");
                            System.out.println("您定的是" + disMegs[i]);
                            System.out.println("送餐时间是" + times[i]);
                            System.out
                                    .println("餐费:" + dishPrice + "元,送餐费:" + deliPrice + "元,总金额:" + sumMoneys[i] + "元");
                            break;
                        }
                    }
                    if (!isAdd) {
                        System.out.println("餐袋已满，无法添加");
                    }
                    break;
                case 2:
                    System.out.println("***查看餐袋***");
                    System.out.println("序号\t订餐人\t餐品信息\t\t\t送餐时间\t" + "送餐地址\t总金额\t订单状态");
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null) {
                            String stateStr = states[i] == 0 ? "已完成" : "已预订";
                            System.out.println((i + 1) + "\t" + names[i] + "\t" + disMegs[i] +
                                    "\t" + times[i] + "\t" + addresses[i] + "\t" + sumMoneys[i] + "\t" +
                                    stateStr);
                        }
                    }
                    break;
                case 3:
                    System.out.println("***签收订单***");
                    boolean isExists = false;// 订单是否存在
                    System.out.println("请输入要签收的订单序号");
                    int no = input.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null && states[i] == 0 && i == no - 1) {
                            isExists = true;
                            System.out.println("订单已完成无法再次签收");
                        } else if (names[i] != null && states[i] == 1 && i == no - 1) {
                            isExists = true;
                            states[i] = 0;
                            System.out.println("订单签收成功");
                            break;
                        }
                    }
                    if (!isExists) {
                        System.out.println("订单不存在，无法签收");
                    }
                    break;

                case 4:
                    System.out.println("4.删除订单");
                    break;
                case 5:
                    System.out.println("***我要点赞***");
                    System.out.println("序号\t菜名\t单价\t点赞数");
                    for (int j = 0; j < dishNames.length; j++) {
                        System.out.println((j + 1) + "\t" + dishNames[j] + "\t" + prices[j] + "\t" + states[j]);
                    }
                    System.out.println("请选择要点赞的菜品序号");
                    int choose = input.nextInt();
                    counts[choose - 1]++;
                    break;
                case 6:
                    System.out.println("6.退出系统");
                    break;

                default:
                    System.out.println("输入0返回");
                    break;
            }
            if (!isExit) {
                System.out.println("输入0返回");
                num = input.nextInt();
            } else {
                break;
            }
        } while (num == 0);
    }
}
