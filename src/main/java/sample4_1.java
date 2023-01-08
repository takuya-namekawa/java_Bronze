public class sample4_1 {
    public static void main(String[] args) {
        int num = 0;

        while (num < 10) {    //numが5未満の間　以下の構文を繰り返す
            System.out.println("numの値は" + num + "です");
            ++num; //これが本当に引っ掛けでインクリメントを代入や出力などおこなってないからこの場合はどちらにおいてもインクリメントされる つまり++numでも同じ結果が得られる
        }
    }
}
