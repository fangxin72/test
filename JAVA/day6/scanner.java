
public class scanner {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int count = 0;
        //
        for (int i = 0; i <= 10; i++) {
            count++;
            if (i == 8) {
                System.out.println("跑不动了");
                break;
            }
            System.out.println("跑了" + count + "圈");
        }
    }
}
