public class sample2_8 {
    public static void main(String[] args) {
        int[] a = new int[1];
        int[] b = a;
        a[0] = 10;
        System.out.println(a[0]);
        System.out.println(b[0]);

        b[0] = 50;
        System.out.println(b[0]);
//bにしか再代入してないのにaにも代入されている　つまりbはコピーされていると共にaそのものになっているという事 一心同体になっている
        System.out.println("");
        System.out.println(a[0]);

        System.out.println("");
        a[0] = 100;
        System.out.println(a[0]);

        System.out.println("");
        System.out.println(b[0]);
    }
}
