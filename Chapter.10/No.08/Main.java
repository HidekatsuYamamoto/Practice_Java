// 8. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("A");
        } finally {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
    }
}

// A. A B C
// B. A B
// C. A C
// D. Compilation error
// E. throw exception
//
// Answer. D.