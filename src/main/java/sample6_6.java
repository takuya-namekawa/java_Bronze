class Test1 {
    int instanceVal = 100;
    static int staticVal = 200;

    void methodA() {
        System.out.println(instanceVal);
    }

    static void methodB() {
        System.out.println(staticVal);
    }
}

public class sample6_6 {
    public static void main(String[] args) {
        System.out.println(Test1.staticVal);
        Test1.methodB();    //staticの呼び出し   staticであればインスタンス化しなくても呼び出せる
        System.out.println("----------------------------------------");

        //しかし　インスタンスメンバはインスタンス化しないと呼ぶことが出来ない

        Test1 t = new Test1();
        System.out.println(t.instanceVal);
        t.methodA();

        System.out.println("----------------------");

        //インスタンス化してる場合のstaticメソッドの呼び出し

        t.methodB();



    }
}
