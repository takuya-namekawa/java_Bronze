class Emp {
    private int user_id;
    public Emp(int i) {
        user_id = i;
    }
    public int getUser_id() {
        return user_id;
    }
}

public class sample6_8 {
    public static void main(String[] args) {
        Emp e = new Emp(1);

        //System.out.println(e.user_id());

        System.out.println(e.getUser_id());

    }
}
