
// 7. 次のプログラムの空欄に入るコードとして、正しいものを選びなさい（１つ選択）。
// A. Consumer
// B. Function
// C. Supplier
// D. Predicate
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Function<String, Integer> func = (str) -> {
            return Integer.parseInt(str);
        };
        System.out.println(func.apply("100") * 2);
    }
}

// A. Consumer -> accept
// B. Function -> apply
// C. Supplier -> get
// D. Predicate -> test
//
// 解答B.