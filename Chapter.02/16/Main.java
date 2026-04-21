public class Main {
    public static void main(String[] args) {
        String str = "abced";
        System.out.println(str.substring(1, 3).startsWith("b"));
    }
}

// 16. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// A. trueと表示される。
// B. falseと表示される。
// C. bcと表示される。
// D. abcと表示される。
// E. コンパイルエラーが発生する。
// F. 実行時に例外がスローされる。
//
// 解答C.
// startsWith
//
// public boolean startsWith(String prefix)
// この文字列が、指定された接頭辞で始まるかどうかを判定します。
// パラメータ:
// prefix - 接頭辞。
// 戻り値:
// 引数によって表される文字シーケンスが、この文字列によって表される文字シーケンスの接頭辞である場合はtrue、
// そうでない場合はfalse。 引数が空の文字列の場合や、equals(Object)メソッドによる判定においてこの
// Stringオブジェクトに等しい場合にもtrueが返される。