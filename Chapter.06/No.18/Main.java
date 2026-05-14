// 18. 次のメソッドをオーバーロードするメソッド定義として、正しいものを
// 　　選びなさい（１つ選択）。
// 
// A. public void method() {}
// B. protected void method() {}
// C. private void method() {}
// D. 選択肢A～Cまで、すべて正しい。
// E. 選択肢A～Cまで、すべて誤りである。
// 
public class Main extends Origin {

    public static void main(String[] args) {
        Main m = new Main();
        m.method();
        m.method(10);
        m.method("test");

        ExtendOne e1 = new ExtendOne();
        e1.method();

        ExtendTwo e2 = new ExtendTwo();
        e2.method();
    }

    // private void method() {
    // System.out.println("継承関係で可視性を減少できない。");
    // }
}

// 解答：E.
// エラーがでる云々ではない。オーバーロードするメソッド定義として、正しいものを選ぶ。
// オーバーロードの定義としては、メソッド名が同じ＋引数が違うなので、アクセス修飾子が変わるか否かではない。
// なお、
