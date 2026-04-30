// 14. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
//
public class Main {

    public static void main(String[] args) {
        String a = "abc";
        String b = new String(a);

        int count = 0;
        if (a.intern() == "abc") {
            count++;
        }
        if (b.intern() == "abc") {
            count++;
        }
        if (a.intern() == b.intern()) {
            count++;
        }
        System.out.println(count);

        System.out.println(a.intern());

        String s1 = new String("Hello");
        String s2 = "Hello";
        String s3 = s1.intern();
        String s4 = s1.intern();

        System.out.println("s1 :" + s1);
        System.out.println("s2 :" + s2);
        System.out.println("s3 :" + s3);
        System.out.println("s4 :" + s4);

        System.out.println("s1 :" + s1.intern());
        System.out.println("s2 :" + s2.intern());
        System.out.println("s3 :" + s3.intern());
        System.out.println("s4 :" + s4.intern());

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
    }
}

// new -> ヒープ
// リテラル -> String constant pool
// intern -> コンスタントプールの値を探す

// A. 0
// B. 1
// C. 2
// D. 3
//
// 解答D