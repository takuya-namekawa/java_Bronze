public class sample4_7 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};

        for (char c : array) {
            System.out.println("拡張forで出す場合" + c);
        }

        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            System.out.println("forで出す場合" + array[i]);
        }
    }
}
