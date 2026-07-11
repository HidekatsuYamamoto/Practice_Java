// 80. 次のプログラムをコンパイル、実行したときの結果として、正しいもの
// を選びなさい（１つ選択）。
public class Test {
    public static void main(String[] args) {
        String[][] array = new String[2][];
        array[0] = new String[2];
        array[1] = new String[5];
        int i = 97;
        // System.out.println(array.length);
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array.length; b++) {
                array[a][b] = "" + i;
                i++;
            }
        }
        for (String[] tmp : array) {
            for (String s : tmp) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}

// A.
// 97 98
// 99 100 null null null
// B.
// 97 98
// 99 100 101 102 103
// C. compilation error
// D. throw NullPointerException
// E. throw ArrayIndexOutOfBoundsException
//
// Ans. A.