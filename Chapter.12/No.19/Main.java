public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.bye();
    }
}

// 19.次のプログラムを確認し、これらのクラスを利用するMainクラスをコンパイル、
// 実行したときの結果として、正しいものを選びなさい（１つ選択）。
// A. bye
// B. null
// C. 何も表示されない。
// D. Compilation error
// E. throw exception
// The answer is D because bye() is not defined in class A.
