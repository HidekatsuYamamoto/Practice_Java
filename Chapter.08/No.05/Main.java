
// 5.
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Sample> list = Arrays.asList(
                new Sample(10),
                new Sample(20),
                new Sample(30));
        // [ 空欄 ]
        Predicate<Sample> x = s -> list.contains(s);
        // Supplier<Sample> x = s -> list.contains(s);
        // Consumer<Sample> x = s -> list.contains(s);
        // Function<Sample> x = s -> list.contains(s);
        if (x.test(new Sample(20))) {
            System.out.println("ok");
        }
    }
}

class Sample {
    private int num;

    public Sample(int num) {
        this.num = num;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Sample == false) {
            return false;
        }
        if (this.num == ((Sample) obj).num) {
            return true;
        }
        return false;
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