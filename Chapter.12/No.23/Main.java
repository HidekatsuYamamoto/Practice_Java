import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b1 = new B();

        List<String> list = new ArrayList<>();

        a1.sample(list);
        a2.sample(list);
        b1.sample(list);
    }
}

// 23. 次のプログラムの説明として、正しいものを選びなさい（３つ選択）。
// A. a1.sample(list);を実行すると、Aが表示される。 〇
// B. a2.sample(list);を実行すると、Aが表示される。 ✕
// C. a2.sample(list);を実行すると、Bが表示される。 〇
// D. b1.sample(list);を実行すると、Bが表示される。 ✕
// E. b1.sample(list);を実行すると、Cが表示される。 〇
// 解答A. C. E.
