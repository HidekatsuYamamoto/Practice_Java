public class Main {
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(10);
        System.out.println(a.equals(b));
    }
}
// 15. 正しいもの １つ選択
// A. true
// B. false
// C. Compilation error
// D. throw exception
//
// Ans.D
// ClassCastException