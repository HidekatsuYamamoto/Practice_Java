package ex78.b;

import ex78.a.A;

public class B extends A {
    // 空欄

    // A. 〇
    // public void test() {
    // }
    // D. 〇
    protected void test() {
    }
    // B. ✕ NG private
    // Cannot reduce the visibility of the inherited method
    // private void test(){}
    // C. ✕ NG デフォルトなので同じ
    // Cannot reduce the visibility of the inherited method
    // void test() {}
}

// 78. 次のプログラムを確認し、Bクラスの空欄に入るコードとして正しいものを
// ２つ選択すること。
// A. public void test() {}
// B. private void test(){}
// C. void test() {}
// D. protected void test() {}
//
// 解答A,D
// B,Cは、抽象クラス内のメソッドより、アクセス修飾子の範囲が狭まるのでNG。