// 5. 次のプログラムをコンパイル、実行したときの結果として、正しいもの選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        System.out.println(test(null));
    }

    private static String test(Object obj) {
        try {
            System.out.println(obj.toString());
            // System.out.println(String.valueOf(obj)); Fixed error
        } catch (NullPointerException e) {
            return "A";
        } finally {
            System.out.println("B");
        }
        return "C";
    }
}

// A. A
// B. A B
// C. B A
// D. C
// E. Compilation error
// F. throw exception
//
// Answer. C.