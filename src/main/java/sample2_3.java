public class sample2_3 {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 30;
       // long num3 = 10000000000;  //桁数が大きすぎるためコンパイルエラー
       // float num4 = 10.0;        //先にdoubleとして認識されてしまうためコンパイルエラー
        //float num4 = 10.0F; とする事でコンパイルエラーを回避出来る
        System.out.println(num1);
        System.out.println(num2);
      //  System.out.println(num3);
       // System.out.println(num4);
    }
}
