public class Main {
    public static void main(String[] args) {

    }

    // A. voidですよね？
    public void methodA(int x) {
        return ++x;
    }

    // B. Stringですよね？
    public String methodB(int x) {
    }

    // C. あり
    public boolean methodC(int a) {
        return a < 0;
    }

    // D. charですよね？
    public char methodD(String str) {
        return str;
    }

    // E. あり
    public void methodE() {
        return;
    }
}

// 37. 次のうち、メソッドの定義として正しいものを選びなさい（２つ選択）。
// 解答C,E