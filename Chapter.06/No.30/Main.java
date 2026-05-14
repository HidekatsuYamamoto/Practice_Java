public class Main {
    public static void main(String[] args) {
        Sample s = new Sample(10);
        modify(s);
        System.out.println(s.num);
    }

    private static void modify(Sample s) {
        s.num *= 2;
    }
}
// 30.
// Sampleクラスを利用するプログラムを、コンパイル、実行したときの
// 結果として、正しいものを１つ選びなさい。
// A. 10
// B. 20
// C. コンパイルエラー
// D. 実行時に例外スロー
// 解答B.