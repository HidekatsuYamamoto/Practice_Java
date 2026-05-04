// 13. 次のコードと同じ結果を出力するコードを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        {
            int num = 10;
            do {
                num++;
            } while (++num < 10);
            System.out.println(num);
        }

        {
            // A.
            int num = 10;
            while (++num < 10) {
                num++;
            }
            System.out.println("A: " + num);
        }

        {
            // B.
            int num = 10;
            while (++num <= 10) {
                num++;
            }
            System.out.println("B: " + num);
        }

        {
            // C.
            int num = 10;
            while (num++ < 10) {
                num++;
            }
            System.out.println("C: " + num);
        }

        {
            // D.
            int num = 10;
            while (num++ <= 10) {
                num++;
            }
            System.out.println("D: " + num);
        }

        {
            // E.
            // A.～D.のどれも同じ結果を出力しない。
            System.out.println("E: どれも同じ結果を出力しない。");
        }
        System.out.println("done.");
    }
}

// 解答E.