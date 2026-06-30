public class Main {
    public static void main(String[] args) {
        // A.
        int[][] array_A = { { 1, 2, 3 }, { 4, 5, 6 } }; // A.

        // B.
        // int[][][] array_B_x = {{1,2}, {3,4},{5,6}}; // B.
        int[][][] array_B_o = { { { 11, 12 }, { 23, 24 } }, { { 35, 36 }, { 47, 48 } },
                { { 591, 592 }, { 60, 61 } } }; // B. fix

        // C.
        // int[][] array_C_x = {0, 1}; // C.
        int[][] array_C_o = { { 1, 2, 3 }, { 4, 5, 6 } }; // C. fix

        // D.
        // int[][] array_D_x = new int[][2]; // D.
        // array_D_x[0][0] = 1;
        // array_D_x[0][1] = 2;
        // array_D_x[1][0] = 3;
        // array_D_x[1][1] = 4;
        int[][] array_D_o = new int[2][2]; // D. fix
        array_D_o[0][0] = 1;
        array_D_o[0][1] = 2;
        array_D_o[1][0] = 3;
        array_D_o[1][1] = 4;

        // E.
        int[] array_E = { 0, 1 }; // E.
        int[][][] array_E2 = new int[2][2][2];
        array_E2[0][0] = array_E;
        array_E2[0][1] = array_E;
        array_E2[1][0] = array_E;
        array_E2[1][1] = array_E;

        for (int[][] i : array_B_o) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.println(k + ", ");
                }
            }
        }
    }
}
// 21. 多次元配列のインスタンス化と初期化のコードとして、正しいものを選んびなさい（２つ選択）。
// A. int[][] array = {{1,2,3},{4,5,6}}; 〇
// B. int[][][] array = {{1,2}, {3,4}, {5,6}}; ✕：次元が異なる。
// C. int[][] array = {0, 1}; ｘ：次元が異なる。
// D. int[][] array_D_x = new int[][2]; ✕：添え字無指定のあとに指定はできない。
// E. int[] array = {0, 1}; 〇
//
// 解答Ａ，Ｅ