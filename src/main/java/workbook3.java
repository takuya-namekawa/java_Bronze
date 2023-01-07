public class workbook3 {
    public static void main(String[] args) {
        boolean b = true;
        if (b = false)  //変数を代入している　そのためbはfalseになる事で出力はされないが、if文外は出力されるという事　変数を代入しているためエラーにはならない
            System.out.println(b);
        System.out.println(b);



    }
}
