// 1. 次のプログラムを確認してください。
public class Child extends Parent {
    Child() {
        name = "Java";
    }

    @Override
    void hello() {
        System.out.println("Child「hello. " + name + "」");
    }

}

// このクラスが継承しているParentクラスの説明として、正しいものを選びなさい。
// （１つ選択）
//
// A. Parentクラスは、helloメソッドの定義を持っていなければいけない。
// B. Parentクラスには、フィールドを初期化するためのコンストラクタを
// 定義しなければいけない。
// C. Parentクラスにはhelloフィールドを定義しなくてはならない。
// D. Parentクラスにはnameフィールドを定義しなくてはならない。
//
// 解答：D.