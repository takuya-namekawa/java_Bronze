public class sample4_10 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i < 5; i++) {
            switch(i % 2) {//iに入っている数字を割った時余りになる数がどのケースに当てはまるのか　そのケース内でインクリメントがあるならば、プラスされていく
                case 0:
                    System.out.println("0 % 2の場合" +  0 % 2);
                    System.out.println("1 % 2の場合" +  1 % 2);
                    System.out.println("2 % 2の場合" +  2 % 2);
                    System.out.println("3 % 2の場合" +  3 % 2);
                    System.out.println("4 % 2の場合" +  4 % 2);
                    num++;
                    break;
                case 1:
                    num++;
                    break;
            }
        }
        System.out.println("num:" + num);
    }
}
