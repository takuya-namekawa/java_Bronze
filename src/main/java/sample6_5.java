class K_T {
    //以下　コンストラクタ　及び　コンストラクタのオーバーロード

    int id;  String address;
    K_T() {
        System.out.println("引数何もいれてないから自由にかける" + 2);
    }

    K_T(String address) {
        System.out.println("東京都港区");
    }

    K_T(int id, String address) {
        System.out.println("ここに社員ナンバーと住所がはいります");
    }

}

public class sample6_5 {
    public static void main(String[] args) {
        K_T nakajima = new K_T();
        K_T tutihasi = new K_T("土橋さんの住所");
        K_T takeda = new K_T(20, "所沢");

    }
}
