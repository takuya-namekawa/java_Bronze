public class sample4_15 {
    public static void main(String[] args) {
        int i = 23; int j = 5;

        loop:for (; j < i; i++) {
            do {
                i += j;

                if (--j == 0) break loop;
                System.out.println("i=" + i);
                System.out.println("j=" + j);
            } while (i < 30);
        }

    }
}
