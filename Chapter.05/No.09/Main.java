// 9. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        A[] array = { new C(), null, new D() };
        Object[] objArray = array;
        for (Object obj : objArray) {
            System.out.println(obj);
        }
    }
}
// A. Mainクラスの3行目でコンパイルエラーが発生する。
// B. Mainクラスの4行目でコンパイルエラーが発生する。
// C. 実行時に例外がスローされる。
// D. コンパイルも実行もできる。
//
// 解答：D