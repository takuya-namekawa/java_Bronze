public class sample2_4 {
    public static void main(String[] args) {
        int num1  = 10;
        num1 = 20;
        System.out.println(num1);//変数の初期化

        final int num2 = 10;
       // num2 = 20;
        System.out.println(num2);  //ファイナル修飾子を使用しているため、変数の初期化が出来ない
    }
}
