
// 16.次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// A. true
// B. false
// C. 1
// D. 0
// E. -1
// 解答C.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a = { "B", "A" };
        String[] b = { "A", "B" };
        System.out.println(Arrays.compare(a, b));
    }
}