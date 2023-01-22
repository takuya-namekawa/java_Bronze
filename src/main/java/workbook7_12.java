class Foo2 {
    protected static int method(int a, int b) {
        return a * b;
    }
}
class Bar extends Foo2 {
    public static int method(int a, int b) {//スタティックの場合は、superは使えない　この場合はクラス名をドット記法で呼び出す
        int c = Foo2.method(a, b);
        return c;
    }
}

public class workbook7_12 {
    public static void main(String[] args) {
        Bar b = new Bar();
        System.out.println(b.method(3,4));
        System.out.println(Bar.method(2,3));
    }
}
