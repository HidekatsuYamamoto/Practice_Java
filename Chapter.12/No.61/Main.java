// 61. 次のプログラムをコンパイル、実行した結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        String s3 = s2.intern();
        System.out.println((s1 == s2) + ", ");
        System.out.println((s2 == s3) + ", ");
        System.out.println(s1 == s3);
        // String s4 = new String("Java");
        // System.out.println(s1 == s4);
        // String s5 = s4.intern();
        // System.out.println(s4 == s5);
        // System.out.println(s2 == s5);
    }
}

// newで切ったものは、新しく確保される。コンスタントは、コンスタントプールに切られる。
// internは、コンスタントプールを探しに行ってあったらそのインスタンスを返す。
// s1は、s2,s3とは異なり。s3はs2と同じになる。
//
// A. false, true, false
// B. true, true, true
// C. true, false, false
// D. true, true, false
// E. false, false, false
//
// Ans. A.
