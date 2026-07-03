package ex42;

import ex42.a.A;
import ex42.b.B;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
        // a.methodA();
    }
}
// 42. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい。
// （１つ選択）
// A. Compilation error
// B. throw an exception
// C. A
// D. B
// 正解は C です。
// 解説
// 変数 a は A 型であり、B 型のインスタンスを参照しています。変数 a の型は A であるため、
// a.x は A クラスの x フィールドを参照します。したがって、出力は A となります。
// メソッドのオーバライドであれば、型を変えても、B クラスのメソッドが呼び出されますが、
// フィールドはオーバライドされないため、A クラスのフィールドが参照されます。