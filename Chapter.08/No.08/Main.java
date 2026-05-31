import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Consumer<String> cns = (str) -> {
            System.out.println(str);
        };

        cns.accept("Hello.");
    }
}

// 8. java.util.function.Consumerの説明として、正しいものを選びなさい（１つ選択）。
// A. 引数を受け取り、その値を使って処理だけを行い、結果は戻さない。 ＝＞ これ
// B. 引数を受け取らず、結果だけを返す。 ＝＞ Supplier
// C. 引数を受け取り判定を行う。 ＝＞ Predicate
// D. 引数を受け取り、それを使って何らかの処理をし、その結果を戻す。 ＝＞ Function
//
// 解答A.