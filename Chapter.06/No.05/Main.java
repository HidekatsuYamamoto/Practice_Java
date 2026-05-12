public class Main {
    public static void main(String[] args) {
        Sample.num = 10;
        Sample s = new Sample();
        Sample s2 = new Sample();
        s.num += 10;
        s2.num = 30;
        System.out.println(Sample.num);
    }
}

// 5. Sampleクラスを利用するMainクラスをコンパイル、実行したときの結果として
// 正しいものを選びなさい（１つ選択）。
// A. 10
// B. 20
// C. 30
// D. mainクラスはコンパイルエラーになる
// E. mainクラスは実行時エラーになる
// 正解：C
// 解説：Sampleクラスのnumはstatic変数であるため、クラス全体で共有されます。
// 最初にnumに10が代入され、その後s.num += 10で20になります。
// 最後にs2.num = 30でnumは30に更新されるため、出力は30になります。