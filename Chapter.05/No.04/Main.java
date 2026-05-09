// 4. 次の中から、コンパイルエラーになるコードを選びなさい。
//
// A. int a[] = new int[2][3];
// B. int[] b = new int[2.3];
// C. int c[] = new int[2 * 3];
// D. int x = 2, y = 3;
// int[] d = new int[x * y];
// E. int[][] e = new int[2][];
// F. int f[][] = new int[][3];
//
// 解答：A(次元が異なる),B(小数点で添え字は無理),F(一次元省略できず)
public class Main {
    public static void main(String[] args) {
        int a[] = new int[2][3];
        int[] b = new int[2.3];
        int c[] = new int[2 * 3];
        int x = 2, y = 3;
        int[] d = new int[x * y];
        int[][] e = new int[2][];
        int f[][] = new int[][3];
    }
}