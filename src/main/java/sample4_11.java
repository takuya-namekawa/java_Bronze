public class sample4_11 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "は,3の倍数なので処理をスキップします");
                continue;
            }
            System.out.println("iの中身は" + i);
        }
    }
}
