class Hi {
    String name; int id;

    public Hi() {
        this("tanaka");
    }
    public Hi(String name) {
        this(name, 2);
    }

    public Hi(String name, int id) {
        this.name = name; this.id = id;
        System.out.println(this.name);
        System.out.println(this.id);
    }
}

public class sample7_4_2 {
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hi hi2 = new Hi("hosono");

    }
}
