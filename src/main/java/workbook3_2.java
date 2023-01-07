public class workbook3_2 {
    public static void main(String[] args) {
        int x = 5;
        boolean b1 = true;
        boolean b2 = false;

        if ((x == 4) && !b2)
            System.out.println("これは表示されない");
        System.out.println("これは表示される　　2だね");

        if ((b2 = true) && b1)
            System.out.println("変数を代入してるからtrue ");

        //回答はD
    }
}
