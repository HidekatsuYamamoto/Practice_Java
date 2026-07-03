public class B extends A {
    public int test(int num) {
        if (isValue(num)) {
            return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.test(10));
    }
}

// 43. 次のプログラムをコンパイル、実行したときの結果として、正しいもの
// を選びなさい（１つ選択）。
// A. 0
// B. 10
// C. throw an exception
// D. compilation error
// 正解：D
//