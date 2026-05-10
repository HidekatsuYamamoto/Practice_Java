// 10. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        int[][] arrayA = { { 1, 2 }, { 1, 2 }, { 1, 2, 3 } };
        int[][] arrayB = arrayA.clone();

        int total = 0;

        for (int[] tmp : arrayB) {
            for (int val : tmp) {
                total += val;
            }
        }
        System.out.println(total);
    }
}
// A. 0
// B. 12
// C. コンパイルエラー
// D. 例外スロー
//
// 正解：B