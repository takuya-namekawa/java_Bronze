public class sample4_2 {
    public static void main(String[] args) {
        int num = 0;

        while (num > 0) {    //numの値が0より大きい場合繰り返す
            System.out.println("numの値は" + num + "です");
            num--;     //デクリメント
        }   //しかし　このwhile文は条件に当てはまらないため、実行されない

        int num2 = 5;

        while (num2 > 0) {
            System.out.println("numの値は" + num2 + "です");
            num2--;
        }
    }
}
