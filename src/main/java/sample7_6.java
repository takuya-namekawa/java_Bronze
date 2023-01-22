class saki {
    public saki() {
        System.out.println("先に表示");
    }
    public saki(int a) {
        System.out.println("引数整数型の先表示");
    }
}
class ato extends saki {
    public ato() {
        System.out.println("あと");
    }
    public ato(int a) {
        //super();  実質書かれてない場合はこのような引数無しのsuperが呼ばれている　
        //上記のスーパークラスのメソッドを呼びたい場合は
        //super(a); という風に引数を与えてあげれば明示的に表示出来る
        System.out.println("引数整数型の後表示");
    }

}
public class sample7_6 {
    public static void main(String[] args) {
        ato a = new ato();
        ato a2 = new ato(1);

    }
}
