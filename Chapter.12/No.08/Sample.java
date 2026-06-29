// 8. 次のプログラムをコンパイル、実行したときの結果として、正しいものを選びなさい（１つ選択）。
public class Sample {
    public static void main(String[] args) {
        String str = "hoge456test";
        int index = 5;
        if (Character.isAlphabetic(str.charAt(index))) {
            index = 0;
        } else if (Character.isDigit(str.charAt(index))) {
            index = 10;
        } else {
            ++index;
        }
        if (str.endsWith("test"))
            str = str.substring(0, index);
        System.out.println(str);
    }
}
// A. hoge
// B. hoge456
// C. 456test
// D. hoge456test
// E. hoge456tes
//
// 解答：E.
// substringは注意。