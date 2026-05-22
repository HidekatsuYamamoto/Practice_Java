public class Main {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a; // 空欄
        b.hello();
    }
}

// 15. 上記プログラムを実行し、「hello」を表示する。空欄に入るコードとして、正しいものを選びなさい（１つ選択）。
// A. A b = a;
// B. A b = new B();
// C. A b = (A) a;
// D. B b = a;
// E. B b = (A) a;
// F. B b = (B) a;
//
// 解答F.
// ダウンキャストはcast演算子をつける必要あり。