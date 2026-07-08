// 64. 次のプログラムを以下に示したコマンドで実行した結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(int[] args) {
        System.out.println("A");
    }

    public static void main(Object[] args) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        System.out.println("C");
    }
}

// A. A
// B. B
// C. C
// D. Compilation Error
// E. throw an exception
//
// Ans. C.