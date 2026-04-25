// 3-5
// 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        // System.out.println(a <= b); <--- The original statement causes an error.
        System.out.println(a == b);
    }
}

// A. true
// B. false
// C. causes a compile error.
// D. throws an exception

// The answer is C because Booleans can't use inequality operators.