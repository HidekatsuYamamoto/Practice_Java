// 12. Sampleクラスを利用する以下のプログラムの空欄に入るコードとして、
// 正しいものを２つ選択しなさい。
public class Main {
    public static void main(String[] args) {
        Sample s = new Sample();
        // 問題文 [ 空欄 ] result = s.divide(10,2);
        // 問題文 System.out.println(result);

        // 答え合わせ
        { // B. float
            float result = s.divide(10, 2);
            System.out.println(result);
        }
        { // C. double
            double result = s.divide(10, 2);
            System.out.println(result);
        }
        { // A. int (Type mismatch)
          // int result = s.divide(10, 2);
          // System.out.println(result);
        }
        { // D. Integer (Type mismatch)
          // Integer result = s.divide(10, 2);
          // System.out.println(result);
        }
        { // E. String (Type mismatch)
          // String result = s.divide(10, 2);
          // System.out.println(result);
        }
        { // F. dim (dimって何？)
          // dim result = s.divide(10, 2);
          // System.out.println(result);
        }

    }
}

// A. int
// B. float
// C. double
// D. Integer
// E. String
// F. dim
//
// 解答：B、C
//