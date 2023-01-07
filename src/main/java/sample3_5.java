public class sample3_5 {
    public static void main(String[] args) {
        int a = 10; int b = 10; int c = 10; int d = 10;

        boolean result1 = a++ > 10 & ++b > 10;//&はとちらかが当てはまらなければfalseなので、aがインクリメント後起きなので数字は10この段階でfalse
        System.out.println(result1);

        boolean result2 = c++ > 10 && ++d > 10;//&&は右辺がfalseの場合は左辺を判定しないので、この場合右辺が後置きインクリメントなので数字の計算は行われないため10で、条件結果はfalseとなるため、その段階でfalseが確定する
        System.out.println(result2);
    }
}
