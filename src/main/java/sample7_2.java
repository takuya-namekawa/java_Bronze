class Syain {  //スーパークラスの定義をしている
    private String syain_id = "100";
    public String getSyain_id() {
        return syain_id;
    }
}

class Eigyou_syain extends Syain {  //サブクラスの定義　　継承している
    private String eigyou_syain_name = "及川";
    public String get_name() {
        return eigyou_syain_name;
    }
}

public class sample7_2 {
    public static void main(String[] args) {
        Eigyou_syain eigyou = new Eigyou_syain();//インスタンス化する事で呼び出す事が可能となる　そして、呼び出す際は継承しているためスーパークラスのインスタンス変数も呼ぶことが出来る
        System.out.println(eigyou.getSyain_id());
        System.out.println(eigyou.get_name());

    }
}
//継承関係のあるクラスの作成をした
//すでに定義されたクラスを拡張して新しいクラスを定義出来る事を継承と呼ぶ
//継承を利用してクラスを定義する際、そのもととなるクラスをスーパークラス
//新たに作成したクラスをサブクラスと呼ぶ
//サブクラスを定義する時はexttendsを使用する

