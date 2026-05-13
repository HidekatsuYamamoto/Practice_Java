// 8. Sampleクラスを利用する以下のプログラムを、コンパイル、実行したときの結果として、
//　　正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.add(10, 20)); // 修正
        // 問題文 System.out.println(s.add(10));
    }
}

// A. 10
// B. 10null
// C. void
// D. コンパイルエラー
// E. 例外スロー
// 解答：D
// 解説：addメソッドは引数が2つ必要ですが、問題文のコードでは1つしか渡されていないため、コンパイルエラーになります。