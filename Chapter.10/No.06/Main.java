// 6. 次のプログラムをコンパイル、実行したときに結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        int result = sample();
        System.out.println(result);
    }

    private static int sample() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            return 10;
        } finally {
            return 20;
        }
    }
}

// A. 10
// B. 20
// C. 30
// D. Compilation error
// E. throw exception
//
// Answer B.