// 23. Sampleクラスを利用する以下のプログラムを、コンパイル、
// 実行したときの結果として、正しいものを選びなさい（１つ選択）。
// 
// A. 「A」と表示される。
// B. 「null」と表示される。
// C. 何も表示されない。
// D. コンパイルエラーが発生する。
// E. 実行時に例外がスローされる。
// 
// 解答：D.
//  問題文のコンストラクタが無い。
public class Main {
    public static void main(String[] args) {
        // 問題文 Sample s = new Sample();
        Sample s = new Sample("TEST"); // 修正点
    }
}
