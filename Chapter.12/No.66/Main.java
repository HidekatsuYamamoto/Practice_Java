import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        // list.forEach(new Sample()::print); // A. The method print(Integer) from the
        // type
        // Sample should be accessed in a static way
        // list.forEach(Sample.print); // B. print cannot be resolved or is not a field
        // list.forEach(Sample:print); // C. Syntax error on token ":", :: expected
        list.forEach(Sample::print); // D.

        // other.
        list.forEach((Integer i) -> {
            (new Sample()).print(i);
        });
    }
}

// 66. 次のプログラムの空欄に入るコードとして、正しいものを選びなさい（１つ選択）。
// A. list.forEach(new Sample()::print);
// B. list.forEach(Sample.print);
// C. list.forEach(Sample:print);
// D. list.forEach(Sample::print);
//
// Ans. D.
//
