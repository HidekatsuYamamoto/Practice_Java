public class Sample {
    private String /* var */ value;

    public Sample(String /* var */ value) {
        this.value = value;
        var other = value; // Added by own

    }

    public void test() {
        System.out.println(value);
    }
}

// 7.次のプログラムをコンパイル、実行したときの結果として正しいものを選びなさい（１つ選択）。
// A. sampleと表示される。
// B. nullと表示される。
// C. コンパイルエラーが発生する。
// D. 実行時に例外がスローされる。
//
// 解答C
// そもそもバリアント型が宣言できない場所で宣言されているし、推論できない。