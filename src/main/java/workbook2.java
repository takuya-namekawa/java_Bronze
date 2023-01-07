public class workbook2 {
    public static void main(String[] args) {
        //2-1
        //参照型はString or boolean
        //CE

        //2-2
        byte a = 100;
       //short b = 50000;
        int c = 10000000;
        long d = 123456789L;
        //short コンパイルエラー C

        //2-3
        //回答はC,D

        //2-4
        //回答はABDG
        //2-5
        //回答はACEF
        //2-6
        //D
        //2-7
        //ADE
        //2-8
        //ABC
        //2-9不正解
        //C
        //2-10
        //C
        //2-11
        //B
        //2-12
        //D
        //2-13
        //D

        //2-9
        char arry1[] = {'a', 'b', 'c', 'd', 'e'};
        char arry2[] = new char[10];
        arry2[0] = 'f';
        arry2[1] = 'g';

        System.out.println(arry1.length + " " + arry2.length);

    }
}
