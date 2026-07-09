public class Main {
    public static void main(String[] args) {
        String[] data = { "りんご", "みかん", "バナナ" };
        Sample_A sa = new Sample_A(data);
        sa.print();

        // Sample_B sb = new Sample_B(data);
        // sb.print();

        // Sample_C sc = new Sample_C(data[0]);
        // sc.print();

        // Sample_D sd = new Sample_D(data);
        // sd.print();

        Sample_E se = new Sample_E(data);
        se.print();

        // Sample_F sf = new Sample_F(data);
        // sf.print();
    }
}
// 68. 次のクラスのコンストラクタのうち、コンパイル可能で、かつ、arrayフィールドに
// 参照をセットすることができるものを選びなさい（２つ選択）。
// A. 〇
// public Sample_A(String[] array) {
// this.array = array;
// }
// B. ✕ (クラスのフィールドに入りません)
// public Sample_B(String... array) {
// array = array;
// }
// C. ✕（次元ちゃう）
// public Sample_C(String str) {
// this.array = str;
// }
// D. ✕（クラスのフィールドに入りません）
// public Sample_D(String[] array) {
// array = array;
// }
// E. 〇（可変長変数は配列になる）
// public Sample_E(String... array) {
// this.array = array;
// }
// F. ✕(要cast)
// public Sample_F(Object[] array) {
// // this.array = (String[]) array;
// this.array = array;
// }