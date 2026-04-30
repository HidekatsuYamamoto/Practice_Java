// 18. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
//
public class Main {

    public static void main(String[] args) {
        int num = 10;
        if (num == 100)
            System.out.println("A");
        else if (10 < num)
            System.out.println("B");
        else if (num == 10)
            System.out.println("C");
        else if (num == 10)
            System.out.println("D");
    }
}

// A. Cが表示される。
// B. Dが表示される。
// C. CとDが表示される。
// D. 何も表示されない。
// E. コンパイルエラーが発生する。
// F. 実行時に例外がスローされる。
//
// 解答A.