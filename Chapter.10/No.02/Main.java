// 2. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい。
// なお、実行時には起動パラメータを何も渡さないこととする（１つ選択）。
public class Main {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("A");
            }
        } catch (NullPointerException e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
    }
}

// A. A B C
// B. A C
// C. B C
// D. A B
// E. コンパイルエラー
// F. 例外スロー
//
// 解答B.
