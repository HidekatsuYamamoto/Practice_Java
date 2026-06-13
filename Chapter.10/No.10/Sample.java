// 10. 次のプログラムをコンパイルし、実行したときの結果として、正しいものを選びなさい（１つ選択）。

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sample {

    public static void main(String[] args) {
        try (FileInputStream is = new FileInputStream("sample.txt")) {
            throw new FileNotFoundException();
        } catch (Exception e) {
            System.out.println("A");
        } finally {
            if (is != null) { // Variable 'is' is only accessible within the try block.
                is.close();
            }
            System.out.println("B");
        }
    }
}

// A. A
// B. B
// C. A B
// D. B A
// E. Compilation error
//
// Answer. E.