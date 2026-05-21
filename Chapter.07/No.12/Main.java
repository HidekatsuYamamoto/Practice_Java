// 12. AクラスとBクラスを確認してください。
// これらのクラスを利用する以下のプログラムを、コンパイル、実行した
// ときの結果として正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        System.out.println(a.val);
        System.out.println(b.val);
        a.print();
        b.print();
    }
}
//
// A. 「ABAB」と表示される。
// B. 「AAAA」と表示される。
// C. 「AAAB」と表示される。
// D. Bクラスでコンパイルエラーが発生する。
// E. Mainクラスでコンパイルエラーが発生する。
// F. 実行時に例外がスローされる。
//
// 解答B.
// A b = new B();なので