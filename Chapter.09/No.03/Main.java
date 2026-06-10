// 3. 次のプログラムを実行し、「」「」「」と表示したい。空欄に入るコードとして正しいものを選びなさい（１つ選択）。

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        {
            List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3 });
            // [ 空欄 ]
            // A. list.sort((a, b) -> a.compareTo(b));
            System.out.println("A. list.sort((a, b) -> a.compareTo(b));");
            list.sort((a, b) -> a.compareTo(b));
            for (Integer num : list) {
                System.out.println(num);
            }
        }

        {
            List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3 });
            // [ 空欄 ]
            // B. list.sort(() -> a.compareTo(b));
            System.out.println("B. list.sort(() -> a.compareTo(b));");
            // list.sort(() -> a.compareTo(b));
            for (Integer num : list) {
                System.out.println(num);
            }
        }

        {
            List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3 });
            // [ 空欄 ]
            // C. list.sort((a) -> a.compareTo(b));
            System.out.println("C. list.sort((a) -> a.compareTo(b));");
            // list.sort((a) -> a.compareTo(b));
            for (Integer num : list) {
                System.out.println(num);
            }
        }

        {
            List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3 });
            // [ 空欄 ]
            // D. list.sort((a, b) -> -a.compareTo(b));
            System.out.println("D. list.sort((a, b) -> -a.compareTo(b));");
            list.sort((a, b) -> -a.compareTo(b));
            for (Integer num : list) {
                System.out.println(num);
            }
        }
    }
}

// 正解D.
