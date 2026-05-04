// 15. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
//
public class Main {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int total = 0;
        for (int i : array) {
            if (i % 2 == 0)
                continue;
            total += i;
        }
        System.out.println(total);
    }
}

// A. 1が表示される。
// B. 9が表示される。
// C. 15が表示される。
// D. コンパイルエラーになる。
// E. 実行時に例外がスローされる。
//
// 正解：B