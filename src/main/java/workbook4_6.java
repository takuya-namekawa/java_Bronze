public class workbook4_6 {
    public static void main(String[] args) {
        int num = 1;
        for (num = 0; num < 3; ++num) {   // for　でインクリメント前置きオーケー　文法エラーにならない
            num *= 2;   //0 x 2 = 0     でnumの中に2が代入される　出力条件はそれで満たしたので　結果は2で　インクリメントされて3となる
            System.out.println(num);
        }
        System.out.println(num++);
    }
}
