public class workbook4_8 {
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < x; ++y)
                System.out.print("for中" + y);

            System.out.print("for外" + x);//カッコで囲まれてないため、外側のforの処理
        }
    }
}
