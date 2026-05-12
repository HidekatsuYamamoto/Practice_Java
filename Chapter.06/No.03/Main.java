// 3. 次のプログラムを実行し、「NULL」と表示したい。3行目の空欄に入るコードとして、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        // [ 空欄 ]
        // System.out.println(obj);

        {
            Object obj = null;
            System.out.println("A. " + obj);
        }

        {
            Object obj = false;
            System.out.println("B. " + obj);
        }

        {
            // Object obj = NULL;
            // System.out.println("C. " + obj);
        }

        {
            Object obj = "";
            System.out.println("D. " + obj);
        }

        {
            String obj = "NULL";
            System.out.println("X. " + obj);
        }

    }
}

// A. Object obj = null;
// B. Object obj = false;
// C. Object obj = NULL;
// D. Object obj = "";
// E. AかC
// F. A、B、C、D、Eのいずれも正しくない。
//
// 解答：F
