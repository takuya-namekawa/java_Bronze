class Foo3 {
    int a, b;
    Foo3 (int b) {
        this.b = b;
    }
    Foo3 (int a, int b) {
        this(++b);
        this.a = a;
    }
}
public class workbook7_14 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        Foo3 obj = new Foo3(a, b);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
