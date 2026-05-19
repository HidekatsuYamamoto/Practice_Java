// 7. 次のプログラムをコンパイル、実行したときの結果として、正しいものを
// 選びなさい（１つ選択）。
public class Main implements A, B {
    public static void main(String[] args) {
        new Main().test();
    }
}

// A. Aが表示される
// B. Bが表示される
// C. コンパイルエラーが発生する
// D. 実行時に例外がスローされる
//
// 解答：C
// 重複したデフォルトメソッドによるエラー
// Duplicate default methods named test with
// the parameters () and () are inherited from
// the types B and A