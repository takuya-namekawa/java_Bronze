class Employee7 {
    private String id = "100";
    public String getId() {
        return id;
    }
}

class Sales extends Employee7 {
    private String clientName = "SE";
    public String getClientName() {
        return clientName;
    }
}

public class sample7 {
    public static void main(String[] args) {
        Sales s = new Sales();
        System.out.println(s.getClientName());
        System.out.println(s.getId());
    }
}
