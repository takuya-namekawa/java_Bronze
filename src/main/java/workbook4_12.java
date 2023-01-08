public class workbook4_12 {
    public static void main(String[] args) {
        int a = 0;
        boolean b = false;
        while (a++ < 3 && !b ) {

            System.out.println("x");
            if (a == 2) {

                System.out.println("y");
            }
        }
        System.out.println("");
        int num = 0;
        while (num++ < 3) {    //numの値が2のループで回ってきたときインクリメントされる関係で数値が変わってくる　先に置かれてる場合は1,2  後ろに置かれてる場合は1,2と出た後にインクリメントされて3がでる
            System.out.println(num);
            //num++;  //この場合の出力だと0から換算される
        }
    }
}
