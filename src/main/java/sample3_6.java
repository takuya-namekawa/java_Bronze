public class sample3_6 {
    public static void main(String[] args) {
        String str1 = null;//null

        String str2 = "";//空欄で要素がある
        System.out.println(str1 == null);
        System.out.println(str2 == null);
        System.out.println("");

        int[] array1 = null;//null

        int[] array2 = new int[1];//要素があるよね
        int num = 0;

        System.out.println(array1 == null);
        System.out.println(array2 == null);
        System.out.println("");

        System.out.println(array1 != null);//ビックリなので結果が逆転します
        System.out.println(array2 != null);
        System.out.println("");

        String aaa = "ABGFGHHH";
        System.out.println(aaa == null);//ストリングは参照型なのでnullの比較が出来る　しかしイントは基本データ型なのでコンパイルエラーを起こす　配列は参照型なので配列の中にイントの要素を格納する場合は別　その場合参照型になっている

        //int num2 = 34;
        //System.out.println(num2  == null);







    }
}
