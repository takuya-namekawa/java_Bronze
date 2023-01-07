public class sample3_11 {
    public static void main(String[] args) {
        int a = 0;
        if (a > 4) {                      //aは4以上ですか？
            System.out.println("aの値は正の値です");
            if (a % 2 == 0) {
                System.out.println("aの値は偶数です");
            }
        } else {

        }   if (a == 0) {
            System.out.println("aの値は0です");
            System.out.println("aは負の値です");
        }   if (a == 2) {
            System.out.println("aの値は4です");
        }

        System.out.println("if構文外");
    }
}
