// 15. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] a = { "b", "c" };
        String[] b = { "a", "b", "c" };
        System.out.println(Arrays.mismatch(a, b));
    }
}
// A. true
// B. false
// C. 1
// D. 0
// E. -1
//
// 解答D.
// 配列間の最初の不一致のインデックスを見つけて返します。一致しない場合は -1を返します。