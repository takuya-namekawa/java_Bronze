import org.w3c.dom.ls.LSOutput;

public class sample3_2 {
    public static void main(String[] args) {


    String str = "Hello";
    int a = 10;
    int b = 20;

        System.out.println(str + a);//Hello10
        System.out.println(str + a + b);//Hello1020
        System.out.println(str + (a + b));//Hello30
        System.out.println(a + b + str);//30Hello

    }
}
