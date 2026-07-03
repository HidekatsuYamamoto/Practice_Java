public class Main {
    public static void main(String[] args) {
        SubSample s1 = new SubSample(100);
        SubSample s2 = new SubSample("Sample", 200, 100);
        System.out.println("s1: name = " + s1.name + ", num = " + s1.num + ", price = " + s1.price);
        System.out.println("s2: name = " + s2.name + ", num = " + s2.num + ", price = " + s2.price);

    }
}

// 44. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// A. sample 200 100
// sample 200 100
// B. null 0 100
// sample 200 100
// C. SubSampleクラスの「public SubSample(int price) {」だけでコンパイルエラーになる。
// D. SubSampleクラスの「this(price);」だけでコンパイルエラーになる。
// E. SubSampleクラスの「public SubSample(int price) {」と
// SubSampleクラスの「this(price);」の両方でコンパイルエラー
// Ans.E.
//