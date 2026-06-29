public class Sample {
    private final int num; // A. ローカル変数は、finalを付けて宣言できる。→ 〇
    public static int num_stic; // C. インスタンス変数はstaticを付けて宣言できる。→ ✕
    // Once static is added, it is no longer an instance.

    public Sample(int num) {
        this.num = num;
        num_stic = num * 2;
    }

    public int getNum() {
        return this.num;
    }

    // public void setNum(int num) {
    // this.num = num;
    // }

    // E. インナークラスは、publicを付けて宣言できる。
    public class InnerClass {
        public void method_in_innerClass() {
            System.out.println("exec.");
        }
    }
}
