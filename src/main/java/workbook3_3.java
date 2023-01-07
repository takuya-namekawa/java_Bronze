public class workbook3_3 {
    public static void main(String[] args) {
        int i = 0;
        switch (i) {
            default:
                System.out.println("default");//defaultが無ければ条件に合致しないので何も表示されないけど、defaultがあるからそのまま構文が動く　つまりcase文になってない　そのまま出力が読まれてる　ちなみにbreak文があれば止まる　defaultの表示となる
            case 10:
                System.out.println("case10");
            case 20:
                System.out.println("case20");
            case 30:
                System.out.println("case30");
        }
    }
}
