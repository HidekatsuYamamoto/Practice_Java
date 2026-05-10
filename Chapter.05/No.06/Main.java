// 6. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        String[] array = { "A", "B", "C", "D" };
        array[0] = null;
        for (String str : array) {
            System.out.print(str);
        }
    }
}

// A. ABCD
// B. BCD
// C. nullBCD
// D. null
// E. コンパイルエラー
// F. 実行時例外スロー
//
// 正解：C
// あくまでforで取り出しているのは配列の要素分なので、中身nullにしても、かんけいない。
