// 3-8
// Sampleクラスを利用する以下のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        Sample s1 = new Sample(10);
        Sample s2 = s1;
        s1 = new Sample(10);
        System.out.println(s1 == s2);
    }
}

// A. true
// B. false
// C. causes a compile error.
// D. throws an exception.

// The answer is B because s1 and s2 are different instances.