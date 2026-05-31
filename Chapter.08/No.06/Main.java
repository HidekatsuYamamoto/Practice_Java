
// 6. java.util.functionパッケージに属する関数型インターフェースで、引数を受け取らず、結果を戻すためのものを選びなさい。
// A. Consumer　単一の入力引数を受け取って結果を返さないオペレーション
// B. Function　1つの引数を受け取って結果を生成する
// C. Supplier　供給
// D. Predicate 判断
//
// 解答C.
//
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        {
            List<Sample> list = Arrays.asList(
                    new Sample(10),
                    new Sample(20),
                    new Sample(30));
            Supplier<List<Sample>> x = () -> list;
            System.out.println(x.get());
        }
    }
}

class Sample {
    private int num;

    public Sample(int num) {
        this.num = num;
    }
}

// A. Predicate<Sample> x = s -> list.contains(s);
// 2つの引数が等しいかどうかを Objects.equals(Object, Object) に従ってテストする述語を返します。
// B. Supplier<Sample> x = s -> list.contains(s);
// C. Consumer<Sample> x = s -> list.contains(s);
// D. Function<Sample> x = s -> list.contains(s);
//
//
// 解答A.

// Predicateのtestは、引数のデータと、Predicateで指定されたデータを比較する。その結果、boolean値を返す⓶。
// 具体的な処理は、Listのcontainで、指定の要素がこのリストに含まれている場合にtrueを返すもの⓵。
//