// 8. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// 
public class Main {
    public static void main(String[] args) {
        String[][] array = { { "A", "B" }, null, { "C", "D", "E" } };
        int total = 0;
        for (String[] tmp : array) {
            total += tmp.length;
        }
        System.out.println(total);
    }
}
// A. 0
// B. 5
// C. 9
// D. コンパイルエラー
// E. 実行時例外スロー
//
// 正解は E です。配列の2番目の要素が null であるため、tmp.length を呼び出すと NullPointerException
// がスローされます。