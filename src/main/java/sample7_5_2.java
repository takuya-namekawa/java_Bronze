class Oya {
    String str;
    public void methodA(){
        str = "name";
    }

}

class Ko extends Oya {
    public void methodA() {
        str = "aoyama";
    }
    public void methodB() {
        methodA();
        System.out.println(str);
        super.methodA();
        System.out.println(str);
        //同じmethodAだがsuperを付ける事で、オーバーライドする前のmeethodAを持ってくることが出来る
    }
}

public class sample7_5_2 {
    public static void main(String[] args) {
        Ko ko = new Ko();
        ko.methodB();
    }
}
