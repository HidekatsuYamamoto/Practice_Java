// 24. 次のプログラムを実行し、コンソールに「ok.」と表示したい。
// Sampleクラスの空欄に入るコードとして正しいものを選びなさい。
// （一つ選択）
// A. Sample(null, 0);
// B. this(null, 0);
// C. super(null, 0);
// D. this.Sample(null, 0);

public class Sample {

    public Sample() {
        // [ 空欄 ]
        // Sample(null, 0);
        this(null, 0);
        // super(null, 0);
        // this.Sample(null, 0);
    }

    public Sample(String str, int num) {
        System.out.println("ok.");
    }
}