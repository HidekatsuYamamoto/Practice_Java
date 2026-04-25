// 3-4
// 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a++ + a + a-- - a-- + ++a;
        System.out.println(b);
    }
}

//
// a = 10 -> 11 -> 12 -> 11 -> 12
// b = 10 + 11 + 11 - 12 + 12 = 32
//
// A. 7
// B. 32
// C. 33
// D. 43
// E. compile error
// F. occur as an exception
//
// 解答B