public class A {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.println(str);
        }
    }
}

// 39. 次のプログラムを以下に示したコマンドで実行したときの結果として、
// 正しいものを選びなさい（１つ選択）。
// > java A "A B" A B
// A. AA BAB
// B. A BAB
// C. A BA B
// D. A B A B
// E. 例外がスロー
//
// 解答：B