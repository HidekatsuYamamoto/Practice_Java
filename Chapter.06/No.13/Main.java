// 13. Sampleクラスを利用する以下のプログラムを、コンパイル、実行したときの
// 結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        Sample s = new Sample();
        // 問題文 int result = s.method(2);
        int result = s.method(1, 1); // 修正
        System.out.println(result);
    }
}

// A. 0
// B. 2
// C. コンパイルエラー
// D. 例外がスロー
//
// 解答：C
// 引数不足