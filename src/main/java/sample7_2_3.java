class Sroban {
    public void keisan(String str) {
        System.out.println(str);
    }
    void method() {
        System.out.println(34);
    }

}

class KousokuSroban extends Sroban {
    public void keisan(String str) {
        System.out.println(str);
    }
    public void method() {
        System.out.println(666666);
    }
}

public class sample7_2_3 {
    public static void main(String[] args) {
        Sroban hontai = new Sroban();
        hontai.keisan("算盤で計算します！");
        hontai.method();

        KousokuSroban kousoku = new KousokuSroban();
        kousoku.keisan("さらに早く算盤で計算します！");
        kousoku.method();
    }
}

//同じメソッドの名前で同じ引数の時、メソッドをオーバーライドするという
//上記では計算というメソッドがあり、そのメソッドをオーバーライドして出力結果を違う文言に変化させる事ができる
//public > protected > デフォルト > private  アクセス修飾子の公開範囲は左から広い
//スーパークラスでprivateでメソッド定義してサブクラスでpublicでオーバーライドするとエラーとなる　公開範囲が弱い　アクセス権限が弱いためコンパイルエラーとなる
