public class Main {
    public static void main(String[] args) {
        new Child("D");
    }
}

// Child(String) -> this();で -> Child() -> super("B");で -> Parent(String val) ->
// this();で// -> System.out.println("A"); -> Parent(String val)のprintlnで"B" ->
// Child()のprintlnで"C" -> this();が終わってChild(String val)のprintlnで”D”

// 21. 上記のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// A. A B C D
// B. A B
// C. B A D C
// D. A B D C
// E. コンパイルエラー
// F. 例外
//
// 解答A.