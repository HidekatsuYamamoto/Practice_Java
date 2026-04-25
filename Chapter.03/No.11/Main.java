// 3-11
// 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = null;
        System.out.println(a.equals(b));
    }
}

// A. true
// B. false
// C. causes a compile error
// D. throws an exception
//
// 解答B