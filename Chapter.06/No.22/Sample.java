// 22. 次のプログラムをコンパイルし、実行したときの結果として、
// 正しいものを選びなさい（１つ選択）。
public class Sample {
    static int num;
    static int num2;

    {
        System.out.println("初期化子");
        num = 10;
    }

    public Sample() {
        System.out.println("コンストラクタ");
        num = 100;
    }

    static {
        num2 = 10;
    }
}