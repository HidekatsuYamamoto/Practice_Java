public class Sample {
    public static void main(String[] args) {
        String[][] array = new String[][] { { "a", "b" }, { "c", "d" } };
        for (String[] a : array)
            for (String b : a)
                System.out.println(b);

        // D : 〇
        System.out.println("D:");
        {
            for (int i = 0; i < 2;) {
                for (int j = 0; j < 2;) {
                    System.out.println(array[i][j]);
                    j++;
                }
                i++;
            }
        }

        // A: ✕（なんで１から？）
        System.out.println("A:");
        {
            for (int i = 1; i < 2; i++) {
                for (int j = 1; j < 2; j++) {
                    System.out.println(array[i][j]);
                }
            }
        }

        // B: ✕（条件式がおかしい）
        System.out.println("B:");
        {
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < i; ++j) {
                    System.out.println(array[i][j]);
                }
            }
        }

        // C: ✕(型の次元ちゃう)
        System.out.println("C:");
        {
            // for (String a : array) {
            // for (String b : array) {
            // System.out.println(b);
            // }
            // }
        }
    }
}

// 71. 次のプログラムを実行し、「abcd」と表示したい。A~Dで正しいもの１つ選べ。
// Ans. D.