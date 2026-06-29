public class Main {
    public static void main(String[] args) {
        Sample.num_stic = 4;

        Sample smpl = new Sample(1);
        System.out.println(smpl.getNum());

        System.out.println(smpl.num_stic);
        smpl.num_stic = 3;
        System.out.println(smpl.num_stic);

        System.out.println(Sample.num_stic);

        Sample.InnerClass ic = smpl.new InnerClass();
        ic.method_in_innerClass();
    }

}

// 17. 修飾子に関する説明として正しいものを選びなさい（２つ選択）。
// A. ローカル変数は、finalを付けて宣言できる。
// → 〇 ： finalは、変更（再代入）はできない。
// B. インタフェースは、protectedを付けて宣言できる。
// → ✕ ： できません。only public, private, abstract, default, static and strictfpと
// エラーメッセージが言ってます。
// C. インスタンス変数はstaticを付けて宣言できる。
// → ✕ ： できません。static付けた時点でインスタンス変数ではなくなります。
// D. 抽象メソッドは、privateを付けて宣言できる。
// → ✕ ： できません。それだと実装できなくなります。
// E. インナークラスは、publicを付けて宣言できる。
// → 〇 ： できます。
// 解答A、E