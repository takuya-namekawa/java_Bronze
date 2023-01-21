class Super {
    public void print(String s) {
        System.out.println(s);
    }

    private void method(){ }
}

class Sub extends Super {
    public void print(String s) {
        s = "渡された文字列は" + s + "です";
        System.out.println(s);
    }
    protected  void method(){ }
}
public class sample7_2_2 {
    public static void main(String[] args) {
        Super s1 = new Super();
        s1.print("java");

        Sub s2 = new Sub();
        s2.print("java");
    }

}
