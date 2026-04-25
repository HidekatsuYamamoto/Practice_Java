// 3-6
// 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        if (10 < a && 10 < ++b) {
            a++;
        }
        System.out.println(a + b);
    }
}

// A. 20
// B. 21
// C. 22
// D. causes a compile error
// E. throws an exception

// The answer is A because the calculation of b on line 8 is not executed.