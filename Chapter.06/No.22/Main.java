// 22. 次のプログラムをコンパイルし、実行したときの結果として、
// 正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        System.out.println("スタート");

        System.out.println("Sample.num :" + Sample.num);

        // Staticなnum2
        System.out.println("Sample.num2 :" + Sample.num2);

        // 動かそうとすれば・・・。
        Sample s = new Sample();
    }
}

// A. 0が表示される。
// B. 10が表示される。
// C. 100が表示される。
// D. コンパイルエラーが発生する。
//
// 解答：B.
// インスタンスは切っていない。コンストラクタ・初期化子うごかない。
