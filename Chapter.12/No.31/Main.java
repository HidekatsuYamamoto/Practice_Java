import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var alphabet = new ArrayList<>(
                Arrays.asList(
                        new String[] { "A", "B", "C", "D", "E" }));
        alphabet.sort((var a, var b) -> -a.compareTo(b));
        alphabet.forEach(System.out::println);
    }
}

// 31. 次のプログラムをコンパイル、実行したときの結果として、正しいものを
// 選びなさい（１つ選択）。
// A. 何も表示されない。
// B. A B C D E
// C. E D C B A
// D. A B
//
// 正しい答えは C. E D C B A です。
//