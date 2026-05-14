package other;

import ex26.Parent;

public class Child extends Parent {
    public static void main(String[] args) {
        // 問題文
        // System.out.println(num);

        // 修正
        Child cld = new Child();
        System.out.println(cld.num);
    }
}

// 26. Parentクラスを利用するプログラムを、コンパイル、実行したとき
// の結果として、正しいものを選びなさい（１つ選択）。
// A. 0が表示される
// B. 10が表示される
// C. Childクラスの宣言のところでコンパイルエラー
// D. Childクラス内のSystemでエラー
// E. 実行時に例外がスローされる。
//
// 解答：D.
// 理由としては、そもそも別のパッケージでアクセス修飾子が
// デフォルトのフィールドを参照することはできないため。
// そもそもフィールド直で見るのはカプセル化に逆行するので、
// よろしくないのではないか。