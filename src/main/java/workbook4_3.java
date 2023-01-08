public class workbook4_3 {
    public static void main(String[] args) {
        int x = 4;
        do {
            ++x;
            System.out.println(x);
        } while(x == 5);
        System.out.println();
    }  //処理はfalseになるまで続くのでこの場合のfalseは6になったら終了となるため、doの構文が二回通ってしまう　そのため出力は二回されるため5,6
}
