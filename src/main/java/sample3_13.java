public class sample3_13 {
    public static void main(String[] args) {
        int num = 3;

        switch (num) {
            case 1:
            case 2:
                System.out.println("numの値は1または2");
                break;
            case 3:
            case 4:
                System.out.println("numの値は3または4");
                break;
            default:
                System.out.println("numの値はそれ以外です");
        }
    }
}
