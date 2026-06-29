public class Sample {
    static String str;

    public static void main(String[] args) {
        switch (str) {
            case "10":
                str += "10";
            default:
                str += "def";
            case "20":
                str += "20";
        }
        System.out.println(str);
    }
}

// 13. 次のプログラムをコンパイル、実行したときの結果として、正しいもの
// を選びなさい（１つ選択）。
// A. 10 def 20
// B. def 20
// C. null
// D. 実行時に例外がスロー
// 解答D.
// Nullは、NullPointerException