import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // A.
        List<A> listA = new ArrayList<>();
        listA.add(new D());

        // B.
        List<B> listB = new ArrayList<>();
        listB.add(new C());

        // C.
        List<B> listC = new ArrayList<>();
        listC.add(new D());

        // D.
        List<D> listD = new ArrayList<>();
        listD.add(new C());

        // E.
        List<A> listE = new ArrayList<>();
        listE.add(new C());
    }
}

// 26. 次のプログラムを確認し、コンパイルエラーとなるコードを選びなさい（１つ選択）。
//
// 解答D. 理由は、上位のクラスを上位の型にあてて使うことはできない。