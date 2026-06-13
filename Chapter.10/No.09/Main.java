// 9. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {

    public static void main(String[] args) {
        try {
            try {
                String[] array = { "A", "B", "C" };
                System.out.println(array[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("D");
                // } catch (NullPointerException e) {
                // System.out.println("D");
            } finally {
                System.out.println("E");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("F");
        } finally {
            System.out.println("G");
        }
    }
}

// A. C E G
// B. D E G
// C. E F G
// D. D E
// E. F G
// F. Compilation error
// G. Throw exception
//
// Answer B.