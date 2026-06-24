import java.util.function.Supplier;

public class Sample {

    void sample() {
        int i = 0;
        Supplier<Integer> foo = () -> i;
        i++;
        System.out.println(foo.get());
    }
}

// ４．次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// A. コンパイルできるが、何も表示されない。
// B. 実行時に例外がスローされる。
// C. ０が表示される。
// D. １が表示される。
// E. コンパイルエラーが発生する。
//
// 解答E.
// ラムダ式内でラムダ式を囲むブロックのローカルを使おうとするのならば、
// Local variable i is required to be final or effectively final based on its
// usageにつきる。