class Wakaran {
    String str;

    public Wakaran() {
        this("こうか！！！！");
    }
    public Wakaran(String str) {
        this.str = str;
        System.out.println(str);
    }
}

class Nn {
    int i; double d;

    public Nn() {
        this(1);
    }

    public Nn(int i) {
        this(2,0.5);
    }

    public Nn(int i, double d) {
        this.i = i; this.d = d;
        System.out.println("目印" + i);
        System.out.println("目印" + d);
    }


}


public class sampel7_4_3 {
    public static void main(String[] args) {
        Wakaran wkaran = new Wakaran("分からん！！");
        Wakaran wakaran2 = new Wakaran();

        System.out.println("1段目-------------------------------------");
        System.out.println("");
        Nn n1 = new Nn();
        System.out.println("2段目-------------------------------------");
        System.out.println("");
        Nn n2 = new Nn(99999999);
        System.out.println("3段目-------------------------------------");
        System.out.println("");
        Nn n3 = new Nn(56, 9.4);
    }
}
