// 3-10
// Sampleクラスを利用する以下のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        Object a = new Sample(10);
        Object b = new Sample(10);
        System.out.println(a.equals(b));
    }
}

// A. Sampleクラスでcompile error
// B. Main 〃
// C. tureが表示
// D. falseが表示
// E. causes a compile error
// F. throws an exception
//
// 解答D
// Sampleクラスのequalsは呼ばれません。