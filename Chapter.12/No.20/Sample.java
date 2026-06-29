// 20. 次のプログラムをコンパイル、実行したときの結果として正しいものを選びなさい（１つ選択）。
public class Sample {
    private char a;
    private int b = 1;

    String test(char a, char b) {
        return a + "," + b;
    }

    public static void main(String[] args) {
        Sample app = new Sample();
        System.out.println(app.test('A'));
        // System.out.println(app.test('A', 'B'));
    }
}

// A. A, 0
// B. A, 1
// C. A, null
// D. Compilation error
// Answer is D.