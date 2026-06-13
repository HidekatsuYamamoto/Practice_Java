// 4. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        try {
            Object obj = null ;
            System.out.println(obj.toString());
            System.out.println("A");
        } finally {
            System.out.println("B");
        } catch (NullPointerException e) {
            System.out.println("C");
        }
    }
}

// A. B C
// B. C B
// C. A C
// D. Compilation error
// E. throw exception
//
// Answer E.
// Syntax error: A catch block cannot be placed after a finally block.