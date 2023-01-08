public class sample4_8 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("for外側の出力" + i);
            if (i % 4 == 0) {
                System.out.println("iは4の倍数です" + i);
            }
        }
    }
}
