public class sample4_9 {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {   //省略するにはセミコロン必要です
            if (i == 3) {
                break;  //iが3になったらbreak　その際の出力は0,1,2まで　3は出力されない
            }
            System.out.println(i);
        }
        System.out.println("if構文外");
    }
}
