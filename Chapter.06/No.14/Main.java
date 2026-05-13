// 14. 次の中から、メソッドの宣言として正しいものを選びなさい（１つ選択）。
// A. void method(void){}
// B. void method(int value...) {}
// C. void method(int... value, String name) {}
// D. void method(int... a, int ...b) {}
// E. 選択肢CとDの両方とも正しい。
// F. 選択肢は全て正しい。
// G. 選択肢AからDは全て間違っている。
//
// 解答：G
//
public class Main {
    public static void main(String[] args) {

    }

    // A. void method(void){}
    // 問題文 void method1(void){} （不要）
    void method1() {
    } // これならOK

    // B. void method(int value...) {}
    // 問題文 void method(int value...) {}
    void method2(int... value) {
    } // これならOK

    // C. void method(int... value, String name) {}
    // 問題文 void method(int... value, String name) {}
    void method3(String name, int... value) {
    } // これならOK

    // D. void method(int... a, int ...b) {}
    // 問題文 void method(int... a, int ...b) {}
    void method4(int... a) {
    } // これならOK
}