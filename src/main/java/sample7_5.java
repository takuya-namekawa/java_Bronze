class Sp {
    int num;
    public void methodA() {
        num += 100;
    }
    public void print() {
        System.out.println("numの値は=" + num);
    }

}

class Su extends Sp {
    public void methodA() {
        num += 500;
    }
    public void methodB() {
        methodA();
        print();
        super.methodA();//明示的にスーパークラスのメソッドを呼び出したいときにsuperを使用する
        print();
    }
}

public class sample7_5 {
    public static void main(String[] args) {
        Sp sp = new Sp();
        sp.methodA();

        Su s = new Su();
        s.methodB();
    }
}
