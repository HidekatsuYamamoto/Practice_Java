// 9. 次のプログラムを実行し、コンソールに「１０」と表示したい。6行目の空欄に入るコードとして、正しいものを選びなさい（１つ選択）
public class Main {
    public static void main(String[] args) {
        int array[][] = new int[][] { { 1, 2 }, { 2, 3, 4 } };
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                total += array[i][j];
            }
        }
        System.out.println(total);
    }
}

// A. int j = 0; j < array[i].length; j++
// B. int j = 0; j < array[j].length; j++
// C. int j = i; j < array[i].length; j++
// D. int j = i; j < array[j].length; j++
// 正解はCです。内側のループの初期値をiにすることで、配列の要素を正しく合計することができます。