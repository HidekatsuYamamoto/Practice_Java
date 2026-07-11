public class Main {
    public static void main(String[] args) {
        SubSample sub = new SubSample();
        Sample sample = new SubSample();
        // sample = sub;
        sub = sample;
        sub.test();
        sample.test();
    }
}

// 77. 次のプログラムをコンパイルし、実行したときの結果として、正しいものを
// 選びなさい（１つ選択）。
// A. Sample#test()
// Sample#test()
// B. SubSample#test()
// SubSample#test()
// C. SubSample#test()
// Sample#test()
// D. 実行時に例外がスロー
// E. コンパイルエラー
//
// Ans. E.
// コンパイルエラーの行をコメントアウトして実行したときは、
// スーパークラスの型にサブクラスを代入したものであってもサブクラスのメソッドが
// 呼ばれます。