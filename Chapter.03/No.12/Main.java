// 3-12
// 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        String a = "sample";
        String b = "sample";
        System.out.println(a == b);
        System.out.println(", ");
        System.out.println(a.equals(b));
    }
}

// A. false, true
// B. false, false
// C. true, false
// D. true, true
// E. causes a compile error
// F. throws an exception
//
// 解答D