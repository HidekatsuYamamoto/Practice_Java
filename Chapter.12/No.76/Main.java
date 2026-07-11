public class Main {
    public void test(Object[] array) {
        System.out.println("A");
    }

    public void test(String[] array) {
        System.out.println("B");
    }

    public void test(Object obj) {
        System.out.println("C");
    }

    public static void main(String[] args) {
        new Main().test(args);
    }
}

// 76. 次のプログラムをコンパイルし、実行したときの結果として、正しいもの
// を選びなさい（１つ選択）。
// A. Aが表示される。
// B. Bが表示される。
// C. Cが表示される。
// D. throw an exception
// E. compilation error
//
// Ans. B