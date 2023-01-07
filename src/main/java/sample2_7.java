public class sample2_7 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println(b);//a変数の中身をコピーしている

        b = 59;//再定義する際は、型はいらない　そのまま変数名と代入値を書けば良い

        System.out.println(b);
    }
}
