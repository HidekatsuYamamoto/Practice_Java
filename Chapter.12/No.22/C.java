public class C extends B {
    @Override
    public double getValue() {
        // C class
        System.out.println(super.num);
        return super.getValue();
    }
}

// 22. 次のプログラムの説明として、正しいものを選びなさい（１つ選択）。
// A. Bクラスのサブクラスでは、getValueメソッドでAクラスのフィールドに
// アクセスすることができる。 → 〇
// B. Bクラスのサブクラスでは、Bクラスのメソッドを呼び出すために
// super.getValue()を使えるが、Aクラスのフィールドにアクセスできない。
// → ✕（アクセスできる）
// C. Bクラスのサブクラスでは、Bクラスのメソッドを呼び出すために
// new.getValue()を使う。
// → ✕（なんだろう。これ）
// D. Bクラスのサブクラスでは、Bクラスのメソッドを呼び出すために
// public.getValue()を使う。
// → ✕（なんだろう。これ）
// 解答：A