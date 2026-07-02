import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static Map<String, String> map = new HashMap<>();
    static List<String> keys = List.of("A", "B", "C");
    static String[] values = { "1", "2", "3" };
    static {
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values[i]);
        }
    }

    public static void main(String[] args) {
        keys.clear();
        values = new String[0];
        System.out.println(map.size() + "," + keys.size() + "," + values.length);
    }
}

// 33. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
// A. 3,3,0
// B. 3,0,0
// C. 3,3,3
// D. コンパイルエラー
// E. 例外がスロー
//
// 解答E.
// List.ofはイミュータブル