// 3-9
// Sampleクラスを利用する以下のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。

public class Main {
    public static void main(String[] args) {
        Sample a = new Sample(10, "a");
        Sample b = new Sample(10, "b");
        System.out.println(a.equals(b));
    }
}
// A. true
// B. false
// C. Sampleクラスでcompile error
// D. Mainクラスでcomplile error
// E. throws an exception
//
// 解答A
