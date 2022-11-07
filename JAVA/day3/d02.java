import java.util.Scanner;

public class d02{
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, num6;//首先定义六个数字
        try (Scanner hy = new Scanner(System.in)) {
            System.out.println("输入一个四位数；");//输入变量
        num5 = hy.nextInt();
        }
        num1 = num5/1000;//假设输入7963.第一位输出7，就使用7963除以1000
            System.out.println("第一位"+num1);//得出第一位是1
        num2 = num5/100-num1*10;//第二位输出为输出的7963除100，得出79，再减去7*10的70
            System.out.println("第二位"+num2);//得出第二位是9
        num3 = num5/10-num1*100-num2*10;//第三位输出为输入的7963除以10，得出796，再减去第一位的7*100，得出96，再用第二位的9乘以10得出90，用96减去90
            System.out.println("第三位"+num3);//得出第三位的6
        num4 = num5-num1*1000-num2*100-num3*10;//第四位输出结果为输入的7963减去num1*10得出的1000再减去num2*100的900再减去num3的6*10
            System.out.println("第四位"+num4);//得出第四位的3
        num6 = num1+num2+num3+num4;//将四位数字相加，得出和
            System.out.println(num5+"相加值为"+num6);//前面输出键盘输入的数值，后面输出相加的和

    }

}