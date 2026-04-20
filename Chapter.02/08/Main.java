public class Main {
    public static void main(String[] args) {
        var b = new B();
        // b = new C();
        b.test();

        {
            var a = new A();
            a = new B();// 継承元の型に入れるのはOKっぽい。
            a.test();
        }
    }
}

// 8.次のプログラムをコンパイル、実行したときの結果として正しいものを選びなさい（１つ選択）。
// A. コンパイルエラーが発生する
// B. 実行時例外がスローされる。
// C. Aが表示される。
// D. Bが表示される。
// E. Cが表示される。
//
// 解答A
// おそらく推論された後に別の型に入れるのはできないのかな。
// 継承元の型に入れるのはOKっぽい。