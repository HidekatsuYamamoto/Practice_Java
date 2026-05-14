package ex27;

public class Main {
    public static void main(String[] args) {
        StoryBook story = new StoryBook();
        story.setIsbn("xxx-x-xxxxxx-xx-x");
        story.printInfo();
    }
}

// 27.
// A. 「null」と表示される。
// B. 「xxx-xxxxxx-xx-x」と表示される。
// C. コンパイルエラー
// D. 例外スロー
//
// 解答C.
// protectedは、同じパッケージ内＋サブクラスと言われている。
// 本コードは、BookのメソッドにPublicをつけてある。