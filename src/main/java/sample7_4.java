class Foo {//コンストラクタのオーバーライド
    String s; int i;
    public Foo() {
        this("Hello");
    }
    public Foo(String s) {
        this(s, 1);
    }
    public Foo(String s, int i) {
        this.s = s; this.i = i;
        System.out.println(this.s);
        System.out.println(this.i);
    }
}
public class sample7_4 {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Foo("mozi");
        Foo f3 = new Foo("mozi2", 1);
    }
}
