import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            while (true) {
                list.add("hello");
            }
        } catch (RuntimeException e) {
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }
        // catch (Throwable e) {
        // System.out.println("D");
        // }
        System.out.println("C");
    }
}

// 69. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// A. A
// B. B
// C. C
// D. throw an exception
// E. throw宣言がなくcompilation error
//
// Ans. D.
// Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
// try-catchで回復処理するものではない。