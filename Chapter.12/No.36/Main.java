public class Main {
    public static void main(String[] args) {
        // 「繰り返し処理コード」
        int x = 0;
        while (x < 10) {
            System.out.println(x++);
        }

        // 「選択肢」
        // A.
        {
            System.out.println("A.");
            for (int a = 0; a < 10;) {
                System.out.println(a++);
            }
        }

        // B.
        {
            System.out.println("B.");
            int b = 0;
            for (; b < 10;) {
                System.out.println(++b);
            }
        }

        // C.
        {
            System.out.println("C.");
            int c = 0;
            for (;; c++) {
                System.out.println(c);
                // to avoid infinite loops
                if (c >= 16) {
                    break;
                }
            }
        }
        // D.
        {
            System.out.println("D.");
            for (int d = 0; d < 10; d++) {
                System.out.println(d++);
            }
        }
    }
}

// 36. 「繰り返し処理」と同じ結果となるfor文を選択肢A.～D.の中から選びなさい（１つ選択）。
// 解答A.
