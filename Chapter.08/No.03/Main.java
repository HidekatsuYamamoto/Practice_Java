// 3. 次のプログラムをコンパイル、実行したときの結果として正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        String val = "A";
        // Lambda expression's parameter val cannot redeclare another local variable
        // defined in an enclosing scope.
        // Function f = (val) -> {
        // System.out.println(val);
        // };
        Function f = (val2) -> {
            System.out.println(val2);
        };
        f.test("B");
    }
}

interface Function {
    void test(String val);

}
// A. Aが表示される。
// B. Bが表示される。
// C. コンパイルエラー
// D. 例外スロー
//
// 解答C.
// Lambda expression's parameter val cannot redeclare another local variable
// defined in an enclosing scope.