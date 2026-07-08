import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new RuntimeErrorException(null);
        } catch (RuntimeException e) {
            System.out.println("A");
        } finally {
            System.out.println("B");
        }
    }
}

// 57. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// A. A
// B. B
// C. Compilation error
// D. throw an exception.
//
// Ans. C