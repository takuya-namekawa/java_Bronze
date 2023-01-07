public class sample3_3 {
    public static void main(String[] args) {
        int a = 10; int b = 10; int c = 10; int d = 10;
        System.out.println(a++);//出力されてからインクリメントなので、インクリメントの対象が後置きの場合は無いことで計算されない
        System.out.println(++b);//前置きであれば計算されてから出力される
        System.out.println(c--);
        System.out.println(--d);
        //出力される時は前置きのみ計算される　後置きは計算されない
        System.out.println("");
        int e = 20; int f = 20; int g = 20; int h = 20;
        f = ++e;//インクリメントされた数字が変数に代入されるため、定義する側の変数と定義される側の変数はイコールである
        System.out.println(f);
        System.out.println(e);

        System.out.println("");
        g = h++;//インクリメントされる前にh変数がg変数に代入される　なので後置きのインリクメントは出力する際は無効という事になる　定義する時(初期化するとき)はどちらに置いても同じ
        System.out.println(g);
        System.out.println(h);

        System.out.println("");
        int n = 7; int m = 7;
        n = n++;
        m = m++;
        System.out.println(n);

        System.out.println("");
        n = ++n;
        m = ++m;
        System.out.println(n);
        System.out.println(m);

        //つまり後起きのインクリメントは無効という事だ！！
    }
}
