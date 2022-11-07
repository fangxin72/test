import java.util.Scanner;

public class sha3{
    public static void main(String[] args) {
        final double xx = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double r = in.nextDouble();
        System.out.println("周长"+2*xx*r);
        System.out.println("面积"+xx*r*r);
        in.close();
    }
}
