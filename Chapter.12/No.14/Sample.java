
// 14. 次のプログラムを確認し、変数xのデータ型として正しいものを選びなさい（１つ選択）。
import java.util.List;
import java.util.Arrays;

public class Sample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[] { "a", "b", "c" });
        list.forEach(x -> {
            System.out.println(x);
            // System.out.println(x.getClass().getName());
        });
    }
}

// 14. 次のプログラムを確認し、変数xのデータ型として正しいものを選びなさい（１つ選択）。
// A. List<Character>
// B. String
// C. char
// D. List<String>
// 解答B.