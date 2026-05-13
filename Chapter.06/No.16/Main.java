// 16. 次のメソッドをオーバーロードしていないメソッド定義を選びなさい（２つ選択）。
// A. int calc(int a) {}
// B. double calc(double a, int b) {}
// C. int calc(double a, double b) {}
// D. int calc(double num1, int num2) {}
// E. int calc() {}
// F. int calc(int a, double b) {}
//
// 解答：BとDかな。Bは戻り値NG。Dは引数に差分なし。

public class Main {
    public static void main(String[] args) {
        Method method = new Method();
        ExtendedFunc exfunc = new ExtendedFunc();
        int result = 0;

        // Origin
        System.out.println(method.calc(2, 3));

        // A. int calc(int a) {}
        result = exfunc.calc((int) 5);
        System.out.println(result);

        // B. double calc(double a, int b) {}
        // No Overloading

        // C. int calc(double a, double b) {}
        result = exfunc.calc((double) 2, (double) 3);
        System.out.println(result);

        // D. int calc(double num1, int num2) {}
        result = exfunc.calc((double) 2, (int) 3);
        System.out.println(result);

        // E. int calc() {}
        result = exfunc.calc();
        System.out.println(result);

        // F. int calc(int a, double b) {}
        result = exfunc.calc((int) 2, (double) 3);
        System.out.println(result);
    }
}
