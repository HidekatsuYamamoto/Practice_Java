// 13. 以下のプログラムを、コンパイル、実行したときの結果として、
// 正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        Worker worker = new Enginner();
        worker.work();
    }
}
// A. Engineerクラスでコンパイルエラーが発生する。
// B. Mainクラスでコンパイルエラーが発生する。
// C. 「work」と表示される。
// D. 実行時に例外がスローされる。
//
// 解答C.
// ポリモーフィズムは、継承関係にあるクラス同士だけでなく、
// インタフェースとの実現の関係でも成り立ちます。