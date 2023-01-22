class A {
    static int num = 0;
    A() {
        num++;
    }
}

class B extends A {
    int num = 10;
    B() {
        num++;
    }
}
public class workbook7_6 {
    public static void main(String[] args) {
        B b1 = new B(); B b2 = new B(); B b3 = new B();  //インスタンス変数にすると中身はオブジェクト毎に保持される　それぞれの値にインクリメントされる
        B[] valB = {b1, b2 ,b3};
        for (B obj : valB) {
            System.out.println(obj.num);
        }
    }
}
