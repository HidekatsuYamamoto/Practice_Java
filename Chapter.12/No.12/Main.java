// 12. 次のプログラムをコンパイルし、実行したときの結果として、
// 正しいものを選びなさい（１つ選択）。
public class Main {

    public static void main(String[] args) {
        String str = "abcd ef gh";
        int x = str.indexOf("ef");
        str.substring(x + 3);
        x = str.indexOf("ef");
        System.out.println(str + " " + x);
    }
}
// A. ef gh 5
// B. ef gh 4
// C. abcd ef gh 4
// D. abcd ef gh 5
// E. 実行時に例外がスロー
//
// 解答D
// substring注意。