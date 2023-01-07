public class sample3_10 {
    public static void main(String[] args) {
        int num = 20;
        String str = "numの値は";
        str += num < 10 ? "10未満" : "10以上";
        System.out.println(str);

        boolean bo = true;
        String str1 = "boの値は？";
        str = bo == true ? "trueです" : "falseです";//trueの場合は右辺　falseの場合が左辺　という事になるね
        System.out.println(bo);

    }
}
