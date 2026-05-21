// 11. 以下のクラスを継承したサブクラスを定義するとき、helloメソッドを
// オーバーライドしようとしている。サブクラスに定義するhelloメソッドに
// 付けられるアクセス修飾子として、正しいものを選びなさい（１つ選択）。
// 
// A. デフォルト（アクセス修飾子なし）
// B. private
// C. public
// D. アクセス修飾子は変えられない
// 
public class Main extends Sample {
    public static void main(String[] args) {
        Main m = new Main();
        m.hello();
    }

    // C. public
    @Override
    public void hello() {
        super.hello();
        System.out.println("hello in Main.");
    }

    // B. private
    // Cannot reduce the visibility of the inherited method from Sample
    // @Override
    // private void hello() {
    // System.out.println("hello.");
    // }

    // A. デフォルト（アクセス修飾子なし）
    // Cannot reduce the visibility of the inherited method from Sample
    // @Override
    // void hello() {
    // System.out.println("hello.");
    // }
}
//
// 解析：C.
// アクセス修飾子は、サブクラスに継承する際に変更できるのは、
// 同じ又はより緩いもの。
// (緩い) public > protected > なし > private（厳しい）
//