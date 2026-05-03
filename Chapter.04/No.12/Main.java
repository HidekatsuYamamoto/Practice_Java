// 12. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（1つ選択）。
//
public class Main {
    public static void main(String[] args) {
        String[] array = { "A", "B", "C" };
        for (String str : array) {
            str = "D";
        }
        for (String str : array) {
            System.out.print(str);
        }
    }
}

// A. DDD
// B. ABC
// C. コンパイルエラー
// D. 実行時エラー
// 正解は B. strのスコープのせい。