// １．次のプログラムをコンパイル、実行したときの結果として、正しいものを１つ選びなさい。
public class Main {

    public static void main(String[] args) {
        int a = 3;
        int b = a += 5;
        System.out.println(a + b);
    }
}

// a = 3 = 8;
// b = 8;
// a + b = 16
//
// A. 8
// B. 10
// C. 16
// D. コンパイルエラー
// E. 例外
//
// 解答C