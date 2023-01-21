final class F {

}

//class F2 extends F {
    //java: final Fからは継承できません
//}

class Method_fainal {
    final public void method(String s) {
        System.out.println(s);
    }
}

class Ue extends Method_fainal {
   // public void method(String s) {}
    //オーバーライドされたメソッドはfinalです
}

public class sample7_3 {
    public static void main(String[] args) {

    }
}
//変数にファイナルを付けた場合は定数となる
//メソッドにファイナル修飾子を付けた場合、サブクラス側でそのメソッドをオーバーライド出来なくなる
//クラスにファイナル修飾子を付けた場合、そのクラスをもとにサブクラスを定義出来なくなる
