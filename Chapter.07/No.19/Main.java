public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "sample";
        System.out.println(child.getName());
    }
}

// 19.
// A. 「sample」と表示される。
// B. 「null」と表示される。
// C. 何も表示されない。
// D. コンパイルエラー
// E. 例外
//
// 解答B.
// getNameメソッドで表示しているのは、Parentクラスのフィールドなので。