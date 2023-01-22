 public class Test6666 {
    public void foo() {
        bar("aaa");
    }
    private void bar(String s) {
        System.out.println("oooo");
    };

    public static void main(String[] args) {
        Test6666 test = new Test6666();
        test.foo();
    }
}