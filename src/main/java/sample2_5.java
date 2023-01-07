public class sample2_5 {
    public static void main(String[] args) {
        char[] c;
        c = new char[3];

        int[] i = new int[3];

        String str[] = {"Welcome", "to", "Java"};

        System.out.println(c); //定義してない状態で(変数を初期化してない状態で出力するとnullが三つでる)
        System.out.println(i); //　[I@7ef20235　配列のiの変数名を出力している
        System.out.println("");
        c[0] = 'A'; c[1] = 'B'; c[2] = 'C'; //配列に入れている場合、一つづつ;で終了しなければいけない　カンマ区切りはエラーになる
        System.out.println(c);

        System.out.println("");

        i[0] = 100; i[1] = 200; i[2] = 300;
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);// 出し方がかわるから注意　charのように指定しなくても要素を出してくれない

        System.out.println("");

        System.out.println(str);//配列名表示
        System.out.print(str[0]);
        System.out.print(str[1]);
        System.out.print(str[2]);





    }
}
