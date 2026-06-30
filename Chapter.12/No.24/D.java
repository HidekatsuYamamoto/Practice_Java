public class D implements B, C {
    @Override
    public void sample() {
        super.sample();
        // B.super.sample();
        // C.super.sample();
    }
}

// 24. Dクラスの説明として正しいものを選びなさい（１つ選択）。
// A. Bインタフェースのsampleメソッドを実装している。
// B. Cインタフェースのsampleメソッドを実装している。
// C. Dクラスがsampleメソッド使わなければオーバーロードする必要はない。
// D. コンパイルエラー
//
// 解答：D. コンパイルエラー
// superがどちらを指すか明確ではない(菱形継承問題)。