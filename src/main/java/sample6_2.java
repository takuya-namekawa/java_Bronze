
    class Employee {
    //これがメソッドの定義と呼ぶ
        int id;
        String address;

        void setAddress(String a) {
            address = a;
        }

        String getAddress() {
            return address;
        }
        void setId(int i) {
            id = i;
        }

        int getId() {
            return id;
        }
    }public class sample6_2 {
    public static void main(String[] args) {

        //インスタンス化と呼ぶ
        Employee userA = new Employee();
        userA.setId(100);
        userA.setAddress("神奈川県横浜市西区みなとみらい");

        Employee userB = new Employee();
        userB.setId(200);
        userB.setAddress("東京都港区六本木");

        System.out.println(userA.getId());
        System.out.println(userB.getId());

        System.out.println(userA.getAddress());
        System.out.println(userB.getAddress());
    }
}
