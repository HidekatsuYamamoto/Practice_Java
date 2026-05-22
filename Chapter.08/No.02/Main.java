// 2. 次のプログラムの「// insert code here」に入るコードとして、
// 誤っているものを２つ選択しなさい。
public class Main {
    public static void main(String[] args) {
        // insert code here

        // A. 〇
        {
            Function f = (name) -> {
                return "hello, " + name;
            };
            System.out.println(f.test("Lambda_A"));
        }

        // B. ✕（returnを省略できず）
        // {
        // Function f = (name) -> {
        // "hello, " + name;
        // };
        // System.out.println(f.test("Lambda_B"));
        // }

        // C. ✕（returnを書けず）
        // {
        // Function f = (name) -> return "hello, " + name;
        // System.out.println(f.test("Lambda_C"));
        // }

        // D. 〇
        {
            Function f = (name) -> "hello, " + name;
            System.out.println(f.test("Lambda_D"));
        }

        // E. 〇
        {
            Function f = name -> {
                return "hello, " + name;
            };
            System.out.println(f.test("Lambda_E"));
        }
    }
}

// A.
// Function f = (name) -> {
// return "hello, " + name;
// };

// B.
// Function f = (name) -> {
// "hello, " + name;
// }

// C.
// Function f = (name) -> return "hello, " + name;

// D.
// Function f = (name) -> "hello, " + name;

// E.
// Function f = name -> {
// return "hello, " + name;
// };
//
// 解答B.とC.
// 引数が１つのとき、括弧を省略可。
// 中括弧を省略することができるのは、処理が１行＋returnかけない。
// 中括弧を入れたときはreturnが必要。