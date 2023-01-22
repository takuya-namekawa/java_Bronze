abstract class Super4444 { //抽象クラス　クラス宣言時にabstractを宣言する　
    protected abstract void methodA();  //抽象メソッド
    public void methodB() {}  //具象メソッド
}

class Sub4444 extends Super4444 {  //抽象クラス事態をインスタンスする事が出来ないため利用する際は抽象クラスを継承したサブクラスを作成する
                                   //抽象クラスを継承したサブクラスが具象クラスの場合もととなる抽象クラスにある抽象メソッドのオーバーライドは必須　　もとの継承が抽象クラスなら抽象クラスのオーバーライドは任意である
    protected void methodA() {
        System.out.println();
    } //必須！！　抽象メソッドは必ず実装

    //以下でもオーケー　アクセス修飾子は同じか公開範囲を広い物を使用
    //public void methodA() {}
    //public void methodB() {}
}

public class sample8_1 {
    public static void main(String[] args) {

    }
}

//処理内容を記述しないメソッドやクラスを定義する事が出来る
//処理内容を記述しないメソッドを抽象メソッドといい抽象メソッドを持つクラスを抽象ｸﾗｽと呼ぶ
//抽象クラスには、具象メソッドも混在させる事が出来る
//抽象メソッドをオーバーライドして処理内容を記述する事を実装とよぶ
