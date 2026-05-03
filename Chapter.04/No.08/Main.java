// 8. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++, period()) {
            System.out.print(i);
        }
    }

    private static void period() {
        System.out.print(",");
    }
}

// A. 「0,1,2,」が表示される。
// B. 「,0,1,2」が表示される。
// C. 「0,1,2」が表示される。
// D. 「,0,1,2,」が表示される。
// E. コンパイルエラーになる。
// F. 実行時例外エラーになる。

// 正解は A です。
