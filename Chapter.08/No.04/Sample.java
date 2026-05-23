// 4. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Sample {
    public static void main(String[] args) {
        // int cnt = 0; 問題文
        Runnable r = () -> {
            for (int cnt = 0; cnt < 10; cnt++) { // 問題文intなし
                System.out.println(cnt++);
            }
        };
        new Thread(r).start();
    }
}

// A. 0123456789
// B. 02468
// C. 1357
// D. compile error
// E. exception
//
// Answer. D. because
// local variable cnt defined in an enclosing scope must be final or effectively
// final