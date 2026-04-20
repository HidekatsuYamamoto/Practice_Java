public class Main {
    public static void main(String[] args) {
        String str = "hoge, world.";
        hello(str);
        System.out.println(str);

        System.out.println(hello2(str));

    }

    private static void hello(String msg) {
        msg.replaceAll("hoge", "hello");
    }

    private static String hello2(String msg) {
        return (msg.replaceAll("hoge", "hello"));
    }
}

// 10. 次のプログラムをコンパイル、実行したときの結果として正しいものを選びなさい（１つ選択）。
// A. hoge, world
// B. hello, world
// C. hello
// D. hello,hello
// E. コンパイルエラー
// F. 例外
//
// 解答 A
// そういうもんでしょ。