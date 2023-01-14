class Test {
    //同じ名前のコンストラクタやメソッドを定義出来る事を
    //オーバーロードと言う
    //ただしそれぞれのメソッドが別でなければいけないので、引数の並び　型　数が事なっている事が条件
    //戻り値及びアクセス修飾子は条件に含まれない
    void myPrint(){
        System.out.println("myPrint");
    }
    void myPrint(int a) {  //→このメソッドを呼ぶには呼び出し側で整数を引数で取る必要がある　以下も同じ
        System.out.println(5);
    }

    void myPrint(int a, int b, int c) {
        System.out.println(455);
    }
    void myPrint(String s) {
        System.out.println("String s");
    }

    String print(int a, String b) {
        return "test";
    }

    String print(int a, int b) {
        return "test2";
    }

    String print(String a, int b) {
        return "test3";
    }
    //String print(String afffff, int yyyyyyuui) {  //この場合は変数名は変えているが、型と並びと変数の数が同じなため、オーバーロードできない
    //    return "test3";
    //}
}


public class sample6_3 {
    public static void main(String[] args) {
        Test t = new Test();
        t.myPrint();
        t.myPrint(1);
        t.myPrint(10, 20, 30);
        t.myPrint("tanaka");

        System.out.println(t.print(1, "b"));
        System.out.println(t.print(1, 1));
        System.out.println(t.print("a", 1));

    }
}
