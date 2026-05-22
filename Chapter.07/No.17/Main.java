public class Main {
    public static void main(String[] args) {
        A a = new A();
        // A a = new B(); // 修正 No.16と同じノリ（クラスBでインスタンスきって、Aにあててたので）
        B b = (B) a;
        b.hello();
    }
}
// 17.
// A. 「A」
// B. 「B」
// C. コンパイルエラー
// D. 例外スロー
//
// 解答：D.