// 5. 次のプログラムをコンパイル、実行したときの結果として、正しいもの
// を選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a);
    }
}
//
// A. Aインタフェースでコンパイルエラーとなる。
// B. Bクラスでコンパイルエラーとなる。
// C. Aが表示される。
// D. Bが表示される。
// E. 実行時に例外がスローされる。
//
// 解答A.
// 原因: Objectクラスのメソッド（例: equals()）を、interfaceの中で
// default メソッドとしてオーバーライドしようとするとコンパイルエラーになります。
// 解決策: equals() や hashCode() などの Object クラスの主要メソッドは、
// クラス（class）側でのみオーバーライドできます。インターフェースでは
// 定義できません。