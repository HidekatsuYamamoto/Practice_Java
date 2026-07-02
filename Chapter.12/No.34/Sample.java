public class Sample {
    public static void main(String[] args) {
        char c = 'b';
        int i = 0;
        switch (c) {
            case 'a':
                i++;
                break;
            case 'b':
                i++;
            case 'c' | 'd':
                i++;
            case 'e':
                i++;
                break;
            case 'f':
                i++;
                break;
            default:
                System.out.println(c);
        }
        System.out.println(i);
    }
}

// 34. 次のプログラムをコンパイル、実行したときの結果として、正しいもの
// を選びなさい（１つ選択）。
// A. 3
// B. b1
// C. 1
// D. b2
// 解答A.