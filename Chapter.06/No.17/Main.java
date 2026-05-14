// 17. 次のプログラムをコンパイル、実行したときの結果として、正しいもの
// 　　を選びなさい（１つ選択）。
public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        // 問題文 System.out.println(m.calc(2, 3));
        System.out.println(m.calc((double) 2, (int) 3)); // 修正
    }

    private double calc(double a, int b) {
        return (a + b) / 2;
    }

    private double calc(int a, double b) {
        return (a + b) / 2;
    }
}

// A. mainメソッド、m.calc(2, 3)にて、コンパイルエラーが発生する。
// B. private double calc(double a, int b)でコンパイルエラーが発生する。
// C. private double calc(int a, double b)でコンパイルエラーが発生する。
// D. 選択肢BとCの両方
// E. 2.5が表示される。
//
// 解答：A
// calcのint,intは無い。