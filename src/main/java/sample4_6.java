public class sample4_6 {
    public static void main(String[] args) {
        int count1 = 0;
        for (; count1 < 5; count1++) {
            System.out.println("count1の出力" + count1);
        }   //省略できると言われているが、前もって変数を宣言してるだけ　

        System.out.println("");

        for (int count2 = 0; count2 < 5;) {
            System.out.println("count2の出力" + count2++);
        }  //省略というよりかは、出力で記載してるから基本的に省略ではない　あとインクリメント後置きでも計算されているのはforの仕様と捉えた方が良い

        int num = 5;
        System.out.println(num++);  //本来は後置きは計算されないからね　　　
    }
}
