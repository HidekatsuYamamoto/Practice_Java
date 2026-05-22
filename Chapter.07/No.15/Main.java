// 15.

public class Main {
    public static void main(String[] args) {
        A[] array = {
            new B(),
            new C(),
            new A(), // Cannot instantiate the type A
            new D() // Type mismatch: cannot convert from D to A
        }
    }
}

// A. new B();でコンパイルエラー
// B. new C();でコンパイルエラー
// C. new A(); 〃
// D. new D(); 〃
// E. 選択肢A.と選択肢B.の両方
// F. 選択肢C.と選択肢D.の両方
// G. 選択肢B.と選択肢C.の両方
// H. 正常に動作する。
//
// 解答：F.
// クラスBは、インタフェースAのサブクラスなのでOK。クラスCは、クラスBと継承関係にありOK。
// クラスDは関係ないのでNG。インタフェースAはインスタンス化できず。
