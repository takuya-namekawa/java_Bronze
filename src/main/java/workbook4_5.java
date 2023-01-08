public class workbook4_5 {
    public static void main(String[] args) {
        for (int i = 4; i < ++i; i++){  //結果は無限ループとなる　比較対象がインクリメントしているため、いつまでたってもその数字にならないため　プログラムそのものを直視して見た方が良いかも
            System.out.println(i);
        }
    }
}
