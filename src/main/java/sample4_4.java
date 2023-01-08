public class sample4_4 {
    public static void main(String[] args) {
        int count = 5;

        //whileの場合
        while (count != 5 && count > 0) {
            System.out.println("while   :   count  = " + count);
            count--;
        }

        //doの場合  countに5が入っている
        do {
            System.out.println("while   :   count  = " + count);
            count--;  //doの場合は先にデクリメントされてから条件式に移る　
        } while (count != 5 && count > 0);  //falseの場合は&&の条件によりfalseとなるためデクリメントされる前のcount変数が表示される　デクリメント
    }
}
