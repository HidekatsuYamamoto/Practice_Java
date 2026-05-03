// 7. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
//
public class Main {

    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 3, j < 5; i++) {
            System.out.println(i);
        }
    }
}

// A. 0 1 2
// B. 0 2 4
// C. 1 2 3
// D. コンパイルエラー
// E. 例外がスロー

// 解答: D. コンパイルエラー。条件は「i < 3, j < 5」となっているが、これは「i < 3 && j <
// 5」と書くべきであるため、コンパイルエラーとなる。
