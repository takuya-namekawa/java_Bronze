public class sample3_12 {
    public static void main(String[] args) {
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("numの値は1です");//1に当てはまる場合はbreak文があるので、この文章を出力して終了
                break;
            case 2:
                System.out.println("numの値は2です");//2に当てはまる場合はこの文章とdefault文が出力される

            default:
                System.out.println("defaultの出力");//何も当てはまる文章が無ければ、default文のみ出力される　そしてcase文がら抜ける

        }

    }
}
