public class sample4_12_2 {
    public static void main(String[] args) {
        loop2:
        for (int a = 0; a < 3; a++) {
            System.out.println("a=" + a);
            for (int b = 0; b < 3; b++) {
                System.out.println("b=" + b);
                if (a == 1 && b == 1) {
                    System.out.println("continue文の実行");
                    System.out.println(a);
                    System.out.println(b);
                    continue loop2;
                }
            }
        }
    }
}
