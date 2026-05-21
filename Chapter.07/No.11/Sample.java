// 11. 以下のクラスを継承したサブクラスを定義するとき、helloメソッドを
// オーバーライドしようとしている。サブクラスに定義するhelloメソッドに
// 付けられるアクセス修飾子として、正しいものを選びなさい（１つ選択）。
public class Sample {
    protected void hello() {
        System.out.println("hello.");
    }
}
// A. デフォルト（アクセス修飾子なし）
// B. private
// C. public
// D. アクセス修飾子は変えられない
//
// 解析：C.
// アクセス修飾子は、サブクラスに継承する際に変更できるのは、
// 同じ又はより緩いもの。
// (緩い) public > protected > なし > private（厳しい）
