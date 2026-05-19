public class B extends A {
    void A1() {
        System.out.println("A1 in B");
    }

    // B. 抽象クラスのメソッドはオーバーライドできない。 → ✕：できる
    @Override
    void A2() {
        String s = new String("ABC from A2.class B");
        System.out.println(s);
    }

    // C. サブクラスから抽象クラスの公開フィールドに自由にアクセス
    // できる。 → 〇：できる。
    void display_num_in_B() {
        System.out.println("num_A in class B : " + num_A);
    }
}
