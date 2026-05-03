// 3. 次のプログラムをコンパイル、実行したときの結果として正しいものを選びなさい（１つ選択）。
//
public class Main {

    public static void main(String[] args) {
        int a = 0;
        while (a < 5) {
            do
                a++;
                System.out.print(a);
            while (true);
        }
    }
}

// A. 012が表示される。
// B. 012が5回表示される。
// C. 何も表示されない。
// D. 無限ループになる。
// E. コンパイルエラーになる。
// F. 実行時に例外がスローされる。
//
// 解答：E