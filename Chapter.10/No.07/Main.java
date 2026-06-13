// 7. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {

    public static void main(String[] args) {
        int result = sample();
        System.out.println(result);
    }

    private static int sample() {
        int val = 0;
        try {
            String[] array = { "A", "B", "C" };
            System.out.println(array[3]);
        } catch (RuntimeException e) {
            val = 10;
            return val;
        } finally {
            val += 10;
        }
        return val;
    }
}

// A. 0
// B. 10
// C. 20
// D. Compilation error
// E. throw exception
//
// Answer B.