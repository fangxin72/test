public class t1{
    public static void main(String[] args) {
        System.out.println("10和8交换");
        int a = 10;
        int b = 8;
        int c;
        System.out.println("左手为：" + a);
        System.out.println("右手为：" + b);
        c=b;
        b=a;
        a=c;
        System.out.println("交换结果左手为：" + a);
        System.out.println("交换结果右手为: " + b);
    }
}