// 6. 次のプログラムを実行し、コンソールに「０」と表示したい。３行目の空欄に入るコードとして、正しいものを選びなさい（１つ選択）。
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i == 0; i++) {
            System.out.println(i);
        }
    }
}

// A. i < 0
// B. i == 0
// C. 0 < i
// D. 1 < 2
//
// 正解は B. i == 0 です。forループの条件がi == 0であるため、ループは1回だけ実行され、コンソールに「０」が表示されます。
