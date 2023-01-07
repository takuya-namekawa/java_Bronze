public class sample3_7 {
    public static void main(String[] args) {
        int num = 5;
        if (num < 10) {
            System.out.println(num + "は10未満です");
        }

        System.out.println("");

        num = 20;
        if (num <= 50)
            System.out.println(num + "は50以下です");
        System.out.println("比較を終了します");


        num = 20;
        if (num >= 50) {
            System.out.println(num + "は50以上です");
            System.out.println("比較を終了します");
        }
    }
}
