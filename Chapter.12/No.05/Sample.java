// 5. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Sample {
    static int num = 23;

    public static void main(String[] args) {
        // int num = Sample.num;
        int num = num;
        System.out.println(num);
    }
}

// A. 23
// B. 想定外の結果
// C. コンパイルエラー
// D. 例外がスロー
//
// 解答C.
// 初期化されておらず。