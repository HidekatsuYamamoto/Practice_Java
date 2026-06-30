public class B extends A {

    // void sample() {
    // System.out.println(20);
    // }

    @Override
    void sample(int i) {
        System.out.println(10);
    }

    public static void main(String[] args) {
        A a = new B();
        a.sample();
    }
}

// 25. 次のプログラムをコンパイル、実行したときの結果として、正しいもの
// を選びなさい（１つ選択）。
// A. 0
// B. 10
// C. コンパイルエラー
// D. 例外スロー
//
// 解答 C.
// たぶん、クラスBのsampleは、オーバーライドじゃなくてオーバロードであり、
// インタフェースAのsampleは実装されていない。