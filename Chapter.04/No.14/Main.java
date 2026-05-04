// 14. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい(１つ選択）
// 
public class Main {
    public static void main(String[] args) {
        String[] array = { "A", "B" };
        for (String a : array) {
            for (String b : array) {
                if ("B".equals(b)) {
                    break;
                }
                System.out.println(b);
            }
        }
    }
}

// A. AA
// B. ABAB
// C. A
// D. AB
// E. BB
//
// 正解：A